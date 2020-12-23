package com.example.rentalcarsrestapi.services.implementations;

import com.example.rentalcarsrestapi.model.User;
import com.example.rentalcarsrestapi.repositories.UserRepository;
import com.example.rentalcarsrestapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> showAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findOneById(Long id) {
        return userRepository.findById(id);
    }
}
