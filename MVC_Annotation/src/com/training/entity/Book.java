package com.training.entity;

import org.springframework.stereotype.Component;

import java.util.logging.*;

@Component
public class Book {

	private long bookNumber;
	private String bookName;
	Logger log = Logger.getLogger(this.getClass().getName());
	
	public Book() {
		super();
		log.info("========== Book Initialized ==========");
	}

	public Book(long bookNumber, String bookName) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
	}

	public long getBookNumber() {
		log.info("========== Get Book Number ==========");
		return bookNumber;
	}

	public void setBookNumber(long bookNumber) {
		log.info("========== Set Book Number ==========");
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		log.info("========== Get Book Name ==========");
		return bookName;
	}

	public void setBookName(String bookName) {
		log.info("========== Set Book Name ==========");
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + "]";
	}
}
