package com.example.rentalcarsrestapi.controllers;

import com.example.rentalcarsrestapi.dto.RegistrationUserRequest;
import com.example.rentalcarsrestapi.dto.RegistrationUserResponse;
import com.example.rentalcarsrestapi.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/register")
    public ResponseEntity<RegistrationUserResponse> registerNewUser(@RequestBody RegistrationUserRequest registrationUserRequest) {
        return ResponseEntity.ok(registrationService.registerNewUser(registrationUserRequest));
    }

    @GetMapping("/confirm-account")
    public ResponseEntity<RegistrationUserResponse> confirmNewUserAccount(@RequestParam("token") String confirmationToken) {
        return  ResponseEntity.ok(registrationService.confirmNewUserAccount(confirmationToken));
    }
}
