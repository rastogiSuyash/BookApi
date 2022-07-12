package com.Book.demo.Entity;

public class Book {
	
	private long id;
	private String bookName;
	private String bookAuthor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(long id, String bookName, String bookAuthor) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	

}
