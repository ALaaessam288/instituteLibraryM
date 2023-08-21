package com.institute.libraryManagementSystem.service;

import com.institute.libraryManagementSystem.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void deleteUserById(Long id);

    // Other service methods related to users
}
