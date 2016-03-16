package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

	@Value("12345")
	private int bookId;
	
	@Value("My Feudal Lord")
	private String bookName;
	
	@Value("Tehmina Durrani")
	private String author;
	
	@Value("280")
	private double amount;

	public Book() {
		super();
	}

	public Book(int bookId, String bookName, String author, double amount) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.amount = amount;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", amount=" + amount + "]";
	}

}
