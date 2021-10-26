package com.vujevaf.app.LibraryShare;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.vujevaf.app.LibraryShare.model.Book;
import com.vujevaf.app.LibraryShare.dao.BookDaoImpl;
import com.vujevaf.app.LibraryShare.services.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

@SpringBootApplication
public class LibraryShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryShareApplication.class, args);

		/*BookService library = new BookService(new BookDaoImpl());
		UUID id = UUID.randomUUID();
		library.persitBook(id, new Book(id, "Brothers Karamazov"));
		for (Book book: library.getAllBooks()){
			System.out.println(book.getTitle());
		}*/

	}
}
