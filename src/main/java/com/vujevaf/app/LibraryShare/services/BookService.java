package com.vujevaf.app.LibraryShare.services;

import com.vujevaf.app.LibraryShare.model.Book;
import com.vujevaf.app.LibraryShare.dao.BooksDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookService {

    private final BooksDao booksDao;

    @Autowired
    public BookService(@Qualifier("bookDatabase") BooksDao booksDao) {
        this.booksDao = booksDao;
    }

    int persistNewBook(Book book){
        return booksDao.insertNewBook(book);
    }

    Book getBookById(UUID bookId){
        return booksDao.selectBookById(bookId);
    }

   public List<Book> getAllBooks(){
        return booksDao.selectAllBooks();
    }

    Book deleteBookById(UUID bookId){
        return booksDao.deleteBookById(bookId);
    }

    boolean updateBookById(UUID bookId, Book updatedBook){
        return booksDao.updateBookById(bookId, updatedBook);
    }


}
