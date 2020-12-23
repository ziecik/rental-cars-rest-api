package com.example.rentalcarsrestapi.controllers;

import com.example.rentalcarsrestapi.exceptions.UserNotFoundException;
import com.example.rentalcarsrestapi.model.User;
import com.example.rentalcarsrestapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserDetails(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.findOneById(id).orElseThrow(() -> {
            return new UserNotFoundException(id);
        }));
    }
}
