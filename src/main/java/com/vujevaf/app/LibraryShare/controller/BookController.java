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
@RequestMapping("api/v1/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
