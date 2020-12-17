package com.example.rentalcarsrestapi.services;

import org.springframework.mail.SimpleMailMessage;

public interface EmailSenderService {
    public void sendEmail(SimpleMailMessage simpleMailMessage);
}
