package com.training.hierarchy;

public class MediaTypes {

	private String title;
	private String dateOfRelease;
	private int lendingLength;
	private int rating;
	
		public MediaTypes(String title, String dateOfRelease, int lendingLength, int rating) {
		super();
		this.title = title;
		this.dateOfRelease = dateOfRelease;
		this.lendingLength = lendingLength;
		this.rating = rating;
	}

	void display()
	{
		System.out.println("Tile: " + title + "\nDate of Release: " + dateOfRelease + "\nLending Length: " + lendingLength + "\nRating: "+ rating);
	}
	
}
