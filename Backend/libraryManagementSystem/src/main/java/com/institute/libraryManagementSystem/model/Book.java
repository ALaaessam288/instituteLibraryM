package com.institute.libraryManagementSystem.model;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;

    // Other book attributes like author, genre, publication year, etc.

    public Book() {
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    // Other getter and setter methods for additional book attributes (if any)
}
