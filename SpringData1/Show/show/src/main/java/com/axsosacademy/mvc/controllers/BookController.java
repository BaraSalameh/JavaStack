package com.axsosacademy.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsosacademy.mvc.services.BookService;

@Controller
public class BookController {
	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping("/")
	public String index() {
		this.bookService.createBook("Harry Potter","A wizard boy", "English",517);
		return "redirect:/books/1";
	}
	
	@RequestMapping(path="/books/{id}", method=RequestMethod.GET)
	public String booksId(@PathVariable("id") Long id,
			Model model) {
		model.addAttribute("book", this.bookService.retrieveBook(id));
		return "booksId.jsp";
	}
}
