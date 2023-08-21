package com.institute.libraryManagementSystem.service;

import com.institute.libraryManagementSystem.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book getBookById(Long id);

    void saveBook(Book book);

    void deleteBookById(Long id);
}
