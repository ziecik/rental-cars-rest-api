package com.example.rentalcarsrestapi;

import com.example.rentalcarsrestapi.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findUserById();
}
