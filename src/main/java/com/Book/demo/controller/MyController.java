package com.Book.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Book.demo.Entity.Book;
import com.Book.demo.service.BookServiceImpl;

@RestController
public class MyController {
	@Autowired
	BookServiceImpl bookService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
		}
	@GetMapping("/books")
	public List<Book> books(){
		return this.bookService.getBooks();
	}
	@GetMapping("/books/{bookId}")
	public Book bookId(@PathVariable String bookId ) {
		return this.bookService.getBookById(Long.parseLong(bookId));
	}
	
	@PutMapping("/books")
	public Book bookAdd(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}
	
	@DeleteMapping("/books/{bookId}")
	public Book bookDelete(@PathVariable String bookId) {
		return this.bookService.deleteBook(Long.parseLong(bookId));
	}

}
