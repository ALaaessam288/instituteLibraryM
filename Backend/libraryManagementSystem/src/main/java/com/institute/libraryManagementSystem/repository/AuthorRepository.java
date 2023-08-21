package com.institute.libraryManagementSystem.repository;

import com.institute.libraryManagementSystem.model.Author;
import com.institute.libraryManagementSystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {

}
//1603575