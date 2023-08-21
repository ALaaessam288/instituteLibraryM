package com.institute.libraryManagementSystem.repository;

import com.institute.libraryManagementSystem.model.Genre;
import com.institute.libraryManagementSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
//1603575