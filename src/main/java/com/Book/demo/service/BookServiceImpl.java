package com.Book.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Book.demo.Entity.Book;
@Service
public class BookServiceImpl implements BookService {
	
	List<Book> books;
	
	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
		books=new ArrayList<>();
		Book b1=new Book(121,"Half Girlfriend", "Chetan Bahagat");
		Book b2=new Book(122,"13 reasons why", "anoynomous");
		books.add(b1);
		books.add(b2);
		
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return books;
	}

	@Override
	public Book getBookById(Long id) {
		// TODO Auto-generated method stub
		Book b=new Book();
		for(Book x:books) {
			if(x.getId()==id) {
				b=x;
				break;
			}
		}
		return b;
	}

	@Override
	public Book addBook(Book book) {
		books.add(book);
		return book;
	}

	@Override
	public Book deleteBook(long Id) {
		Book b=new Book();
		for(Book x : books) {
			if(x.getId()==Id) {
				b=x;
				break;
			}
		}
		books.remove(b);
		return b;
	}

}
