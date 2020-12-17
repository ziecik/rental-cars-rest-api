package com.example.rentalcarsrestapi.model;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class ConfirmationToken {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private User user;
    private String token;
    private Date createdDate;

    public ConfirmationToken() {
    }

    public ConfirmationToken(User user) {
        this.user = user;
        this.token = UUID.randomUUID().toString();
        this.createdDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getToken() {
        return token;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
}
