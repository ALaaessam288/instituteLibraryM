package com.institute.libraryManagementSystem.repository;

import com.institute.libraryManagementSystem.model.Author;
import com.institute.libraryManagementSystem.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {

}
//1603575