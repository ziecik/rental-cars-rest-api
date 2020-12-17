package com.example.rentalcarsrestapi.controllers;

import com.example.rentalcarsrestapi.dto.AuthenticationRequest;
import com.example.rentalcarsrestapi.model.Role;
import com.example.rentalcarsrestapi.model.RoleName;
import com.example.rentalcarsrestapi.model.User;
import com.example.rentalcarsrestapi.repositories.RoleRepository;
import com.example.rentalcarsrestapi.repositories.UserRepository;
import com.example.rentalcarsrestapi.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/admin")
    public String authenticate() {
        return "admin";
    }

    @GetMapping("/user")
    public String userInfo() {
        return "User info only";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) {
        return ResponseEntity.ok(authenticationService.createAuthenticationResponse(authenticationRequest));
    }

//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    RoleRepository roleRepository;
//    @GetMapping("/dummySetup")
//    public Set<Role> dummyStup() {
//        User user = userRepository.findByUsername("jaroslaw.ziecik@gmail.com");
//        user.setEnabled(true);
//        Set<Role> roles = user.getRoles();
//
//        Role role = roleRepository.findByName(RoleName.ROLE_USER);
//        if(role == null) {
//
//            role = new Role();
//            role.setRole(RoleName.ROLE_USER);
//            roleRepository.save(role);
//            user.setRoles(roles);
//            userRepository.save(user);
//        }
//        if(!roles.contains(role)) {
//            roles.add(role);
//            user.setRoles(roles);
//            userRepository.save(user);
//        }
//
//        return userRepository.findByUsername(user.getUsername()).getRoles();
//    }
}
