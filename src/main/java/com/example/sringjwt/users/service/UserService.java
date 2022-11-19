package com.example.sringjwt.users.service;


import com.example.sringjwt.users.entities.Role;
import com.example.sringjwt.users.entities.User;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);

}