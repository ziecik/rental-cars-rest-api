package com.example.rentalcarsrestapi.dto;

import org.springframework.stereotype.Component;

@Component
public class RegistrationUserResponse extends UserResponse{

    public RegistrationUserResponse() {
    }

    public RegistrationUserResponse(String message) {
        super(message);
    }
}
