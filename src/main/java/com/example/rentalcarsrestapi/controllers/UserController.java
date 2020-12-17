package com.example.rentalcarsrestapi.controllers;

import com.example.rentalcarsrestapi.model.User;
import com.example.rentalcarsrestapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/users")
    public List<User> showAllUsers() {
        return userService.showAllUsers();
    }
}
