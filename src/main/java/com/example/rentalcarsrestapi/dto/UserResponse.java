package com.example.rentalcarsrestapi.dto;

import org.springframework.stereotype.Component;

@Component
public class UserResponse {
    private String message;

    public UserResponse() {
    }

    public UserResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
