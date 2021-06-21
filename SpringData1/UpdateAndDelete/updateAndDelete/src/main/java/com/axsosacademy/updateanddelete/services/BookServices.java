package com.axsosacademy.updateanddelete.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsosacademy.updateanddelete.models.Book;
import com.axsosacademy.updateanddelete.repositories.BookRepository;

@Service
public class BookServices {
	private final BookRepository bookRepository;
	
	public BookServices(BookRepository bookRepository) {
		this.bookRepository =bookRepository; 
	}
	
	public void deleteById(Long id) {
		this.bookRepository.deleteById(id);
	}
	
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}
	
	public Optional<Book> getBookById(Long id) {
		return bookRepository.findById(id);
		
	}
	
	public void updateBook(Long id, String title, String description, int numberOfPages, String language){ 
		Optional<Book> book = getBookById(id);
		if(book.isPresent()) {
			Book b = book.get();
			b.setTitle(title);
			b.setDescription(description);
			b.setNumberOfPages(numberOfPages);
			b.setLanguage(language);
			bookRepository.save(b);
		}
	}
}
