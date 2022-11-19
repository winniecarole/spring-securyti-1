package com.example.sringjwt.users.repos;

import com.example.sringjwt.users.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username); //je recherche un User dans la base de donne
}