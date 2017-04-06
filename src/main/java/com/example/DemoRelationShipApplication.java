package com.example;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.OneToMany.Book;
import com.example.OneToMany.BookRepo;



@SpringBootApplication
public class DemoRelationShipApplication implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoRelationShipApplication.class);
	
	@Autowired
	private BookRepo bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoRelationShipApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		/*One to one
		 * // save a couple of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book A", new BookDetail(49)));
        books.add(new Book("Book B", new BookDetail(59)));
        books.add(new Book("Book C", new BookDetail(69)));
        bookRepo.save(books);

        // fetch all books
        for (Book book : bookRepo.findAll()) {
            logger.info(book.toString());
        }
		
		// save a couple of books
        List<BookDetail> books = new ArrayList<>();
        books.add(new BookDetail(49,new Book("Book A")));
        books.add(new BookDetail(59,new Book("Book B")));
        books.add(new BookDetail(69,new Book("Book C")));
        bookRepo.save(books);

        // fetch all books
        for (BookDetail book : bookRepo.findAll()) {
            logger.info(book.toString());
        }*/
		
		/* One To Many */
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Book A",))
		
		
		
	}
	
	
}
