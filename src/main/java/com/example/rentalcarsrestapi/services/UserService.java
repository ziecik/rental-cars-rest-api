package com.example.rentalcarsrestapi.services;

import com.example.rentalcarsrestapi.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> showAllUsers();

    Optional<User> findOneById(Long id);
}
