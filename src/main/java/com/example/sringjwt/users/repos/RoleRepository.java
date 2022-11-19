package com.example.sringjwt.users.repos;

import com.example.sringjwt.users.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}