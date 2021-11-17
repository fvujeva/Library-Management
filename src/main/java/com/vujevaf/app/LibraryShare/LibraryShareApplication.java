package com.vujevaf.app.LibraryShare;

import com.vujevaf.app.LibraryShare.model.Book;
import com.vujevaf.app.LibraryShare.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.UUID;


@SpringBootApplication
public class LibraryShareApplication{


	public static void main(String[] args) {
		SpringApplication.run(LibraryShareApplication.class, args);

		/*BookService library = new BookService(new BookDaoImpl());
		UUID id = UUID.randomUUID();
		library.persitBook(id, new Book(id, "Brothers Karamazov"));
		for (Book book: library.getAllBooks()){
			System.out.println(book.getTitle());
		}*/

	}

	@Component
	class DemoCommandLineRunner implements CommandLineRunner {

		@Autowired
		private BookRepository bookRepository;

		@Override
		public void run(String... args) throws Exception {

			Book audi = new Book(UUID.randomUUID(), "Lolita");

			bookRepository.save(audi);

			Book tesla = new Book(UUID.randomUUID(), "Brothers Karamazov");

			bookRepository.save(tesla);
		}
	}
}
