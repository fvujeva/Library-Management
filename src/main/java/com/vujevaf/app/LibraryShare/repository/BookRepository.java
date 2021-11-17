package com.vujevaf.app.LibraryShare.repository;

import com.vujevaf.app.LibraryShare.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BookRepository extends CrudRepository<Book, UUID> {

}
