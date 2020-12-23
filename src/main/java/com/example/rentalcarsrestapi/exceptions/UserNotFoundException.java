package com.example.rentalcarsrestapi.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Could not find user: " + id);
    }
}
