package com.example.rentalcarsrestapi.services;

import com.example.rentalcarsrestapi.dto.AuthenticationRequest;
import com.example.rentalcarsrestapi.dto.AuthenticationResponse;
import org.springframework.http.ResponseEntity;

public interface AuthenticationService {
    AuthenticationResponse createAuthenticationResponse(AuthenticationRequest authenticationRequest);
}
