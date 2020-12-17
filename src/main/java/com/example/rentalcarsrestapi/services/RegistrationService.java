package com.example.rentalcarsrestapi.services;

import com.example.rentalcarsrestapi.dto.RegistrationUserRequest;
import com.example.rentalcarsrestapi.dto.RegistrationUserResponse;

public interface RegistrationService {

    public RegistrationUserResponse registerNewUser(RegistrationUserRequest registrationUserRequest);
    public RegistrationUserResponse confirmNewUserAccount(String confirmationToken);
}
