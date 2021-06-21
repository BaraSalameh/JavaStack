package com.axsosacademy.updateanddelete.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.axsosacademy.updateanddelete.models.Book;
import com.axsosacademy.updateanddelete.services.BookServices;

@RestController
public class BookController {
	private final BookServices bookServices;
	
	public BookController(BookServices bookServices) {
		this.bookServices = bookServices;
	}
	
	@RequestMapping("")
	public String index() {
		Book book = new Book("Bara","man on fire",300,"France");
		bookServices.createBook(book);
		return "book added successfully";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateBook(@RequestParam(value="id") Long id,
			@RequestParam(value="title") String title,
			@RequestParam(value="description") String description,
			@RequestParam(value="numberOfPages") int numberOfPages,
			@RequestParam(value="language") String language) {
		bookServices.updateBook(id, title, description, numberOfPages, language);
		return "book updatedSuccessfully";
	}
}
