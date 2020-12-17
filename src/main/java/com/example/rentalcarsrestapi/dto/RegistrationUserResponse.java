package com.example.rentalcarsrestapi.dto;

import org.springframework.stereotype.Component;

@Component
public class RegistrationUserResponse {
    private String message;

    public RegistrationUserResponse() {
    }

    public RegistrationUserResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
