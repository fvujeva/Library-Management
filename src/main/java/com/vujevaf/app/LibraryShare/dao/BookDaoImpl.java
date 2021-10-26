package com.vujevaf.app.LibraryShare.dao;

import com.vujevaf.app.LibraryShare.dao.BooksDao;
import com.vujevaf.app.LibraryShare.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository("bookDatabase")
public class BookDaoImpl implements BooksDao {

    private Map<UUID, Book> database;

    public BookDaoImpl() {
        database = new HashMap<>();
        UUID id = UUID.randomUUID();
        database.put(id, new Book(id, "Brothers"));
    }


    @Override
    public int insertNewBook(Book book) {
        database.put(book.getId(), book);
        return 1;
    }

    @Override
    public Book deleteBookById(UUID bookId) {
        return database.remove(bookId);
    }

    @Override
    public boolean updateBookById(UUID bookId, Book updatedBook) {
        database.replace(bookId, updatedBook);
        return false;
    }

    @Override
    public Book selectBookById(UUID bookId) {
        return database.get(bookId);
    }

    public List<Book> selectAllBooks(){
        return database.values().stream().collect(Collectors.toList());
    }
}
