package com.example.rentalcarsrestapi.dto;

import com.sun.istack.NotNull;
import org.springframework.stereotype.Component;

@Component
public class RegistrationUserRequest {

    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
//    @NotNull
//    private String username;
    @NotNull
    private String password;
    @NotNull
    private String repeatedPassword;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatedPassword() {
        return repeatedPassword;
    }

    public void setRepeatedPassword(String repeatedPassword) {
        this.repeatedPassword = repeatedPassword;
    }
}
