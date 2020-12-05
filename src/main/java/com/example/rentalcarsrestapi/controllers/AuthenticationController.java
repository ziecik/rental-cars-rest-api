package com.example.rentalcarsrestapi.controllers;

import com.example.rentalcarsrestapi.dto.AuthenticationRequest;
import com.example.rentalcarsrestapi.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/admin")
    public String authenticate() {
        return "admin";
    }

    @GetMapping("/user")
    public String userInfo() {
        return "User info only";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) {
        return ResponseEntity.ok(authenticationService.createAuthenticationResponse(authenticationRequest));
    }
}
