package com.example.rentalcarsrestapi.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @NaturalId
    private RoleName name;
    @ManyToMany(mappedBy = "roles")
    Set<User> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleName getRole() {
        return name;
    }

    public void setRole(RoleName name) {
        this.name = name;
    }
}
