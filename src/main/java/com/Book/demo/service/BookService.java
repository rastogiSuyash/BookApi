package com.Book.demo.service;

import java.util.List;

import com.Book.demo.Entity.Book;

public interface BookService {
	
	public List<Book> getBooks();
	public Book getBookById(Long id);
	public Book addBook(Book book);
	public Book deleteBook(long Id);

}
