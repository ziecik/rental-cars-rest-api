package com.example.rentalcarsrestapi.repositories;

import com.example.rentalcarsrestapi.model.Role;
import com.example.rentalcarsrestapi.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(RoleName roleName);
}
