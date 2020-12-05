package com.example.rentalcarsrestapi.services;

import com.example.rentalcarsrestapi.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findUserById();
}
