package com.vujevaf.app.LibraryShare.controller;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.vujevaf.app.LibraryShare.model.Book;
import com.vujevaf.app.LibraryShare.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.UUID;

@RestController
public class BookController {

    @Autowired
    BookService bookService;


    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    private Book getStudent(@PathVariable("id") UUID id)
    {
        return bookService.getBookById(id);
    }

    @DeleteMapping("/books/{id}")
    private void deleteStudent(@PathVariable("id") UUID id)
    {
        bookService.deleteBookById(id);
    }
    //creating post mapping that post the student detail in the database
    @PostMapping("/books")
    private UUID saveStudent(@RequestBody Book book)
    {
        bookService.persistNewBook(book);
        return book.getId();
    }
}
