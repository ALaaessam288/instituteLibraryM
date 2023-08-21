package com.institute.libraryManagementSystem.repository;

import com.institute.libraryManagementSystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {

}
