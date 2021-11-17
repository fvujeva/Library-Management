package com.vujevaf.app.LibraryShare.services;

import com.vujevaf.app.LibraryShare.model.Book;
import com.vujevaf.app.LibraryShare.dao.BooksDao;
import com.vujevaf.app.LibraryShare.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BookService {

    //private final BooksDao booksDao;

    @Autowired
    BookRepository bookRepository;

   /* @Autowired
    public BookService(@Qualifier("bookDatabase") BooksDao booksDao) {
        this.booksDao = booksDao;
    }*/

    public Book persistNewBook(Book book){
        return bookRepository.save(book);
    }

    public Book getBookById(UUID bookId){
        return bookRepository.findById(bookId).get();
    }

    public List<Book> getAllBooks(){
       List<Book> books = new ArrayList<Book>();
       bookRepository.findAll().forEach(book -> books.add(book));
       return books;
    }

    public void deleteBookById(UUID bookId){
        bookRepository.deleteById(bookId);
    }

    /*boolean updateBookById(UUID bookId, Book updatedBook){
        return booksDao.updateBookById(bookId, updatedBook);
    }*/


}
