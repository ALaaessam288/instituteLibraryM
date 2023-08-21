package com.institute.libraryManagementSystem.service;

import com.institute.libraryManagementSystem.model.Book;
import com.institute.libraryManagementSystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImp implements BookService {
private final BookRepository bookRepository ;
@Autowired
    public BookServiceImp(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
      return   bookRepository.findAll() ;
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null) ;
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book) ;


    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);

    }
}
