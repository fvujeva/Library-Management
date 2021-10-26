package com.vujevaf.app.LibraryShare.dao;

import com.vujevaf.app.LibraryShare.model.Book;

import java.util.List;
import java.util.UUID;

public interface BooksDao {
    int insertNewBook(Book book);

    Book deleteBookById(UUID bookId);

    boolean updateBookById(UUID bookId, Book updatedBook);

    Book selectBookById(UUID bookId);

    List<Book> selectAllBooks();

}
