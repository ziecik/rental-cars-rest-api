package com.example.rentalcarsrestapi.services.implementations;

import com.example.rentalcarsrestapi.dto.RegistrationUserRequest;
import com.example.rentalcarsrestapi.dto.RegistrationUserResponse;
import com.example.rentalcarsrestapi.model.ConfirmationToken;
import com.example.rentalcarsrestapi.model.Role;
import com.example.rentalcarsrestapi.model.RoleName;
import com.example.rentalcarsrestapi.model.User;
import com.example.rentalcarsrestapi.repositories.ConfirmationTokenRepository;
import com.example.rentalcarsrestapi.repositories.RoleRepository;
import com.example.rentalcarsrestapi.repositories.UserRepository;
import com.example.rentalcarsrestapi.services.EmailSenderService;
import com.example.rentalcarsrestapi.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private ConfirmationTokenRepository confirmationTokenRepository;
    @Autowired
    private EmailSenderService emailSenderService;
    @Value("${my.local.server.ip}")
    private String serverIp;

    @Override
    public RegistrationUserResponse registerNewUser(RegistrationUserRequest registrationUserRequest) {
        User existingUser = userRepository.findByUsername(registrationUserRequest.getEmail());
        if(existingUser != null) {
            return new RegistrationUserResponse("This email already exists!");
        } else {
            User newUser = new User();
            newUser.setFirstName(registrationUserRequest.getFirstName());
            newUser.setLastName(registrationUserRequest.getLastName());
            newUser.setEmail(registrationUserRequest.getEmail());
            newUser.setUsername(registrationUserRequest.getEmail());
            newUser.setPassword(passwordEncoder.encode(registrationUserRequest.getPassword()));
            Set<Role> roles = new HashSet<>();
            Role role = roleRepository.findByName(RoleName.ROLE_USER);
            roles.add(role);
            newUser.setRoles(roles);
            newUser.setEnabled(false);
            userRepository.save(newUser);

            ConfirmationToken confirmationToken = new ConfirmationToken(newUser);
            confirmationTokenRepository.save(confirmationToken);

            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setTo(newUser.getEmail());
            simpleMailMessage.setSubject("Complete your registration!");
            simpleMailMessage.setText("To finish registration process confirm your email by clicking the link: http://"
                    + serverIp + ":8080/api/confirm-account?token=" + confirmationToken.getToken());
            emailSenderService.sendEmail(simpleMailMessage);

            return new RegistrationUserResponse("Confirmation link has been sent on email " + registrationUserRequest.getEmail());
        }

    }

    @Override
    public RegistrationUserResponse confirmNewUserAccount(String confirmationToken) {
        ConfirmationToken token = confirmationTokenRepository.findByToken(confirmationToken);
        if(token != null) {
            User user = userRepository.findByUsername(token.getUser().getEmail());
            user.setEnabled(true);
            userRepository.save(user);
            confirmationTokenRepository.delete(token);
            return new RegistrationUserResponse("Congratulations! Your account has been activated!");
        } else {
            return new RegistrationUserResponse("The link is invalid or broken!");
        }
    }
}
