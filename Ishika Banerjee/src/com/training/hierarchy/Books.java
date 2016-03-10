package com.training.hierarchy;

public class Books extends MediaTypes {

	private String author;
	private long isbn_number;
	private String publication;
	private int edition;
	
		public Books(String title, String dateOfRelease, int lendingLength, int rating, String author, long isbn_number,
			String publication, int edition) {
		super(title, dateOfRelease, lendingLength, rating);
		this.author = author;
		this.isbn_number = isbn_number;
		this.publication = publication;
		this.edition = edition;
	}

	void display()
	{
		super.display();
		System.out.println("Author: " + author + "\nISBN Number: " + isbn_number + "\nPublication: " + publication + "\nEdition: " + edition);
	}
	
}
