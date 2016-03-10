package com.training.hierarchy;

public class Periodicals extends MediaTypes {

	private String subject;
	private int volumeNumber;
	private String publication;

	public Periodicals(String title, String dateOfRelease, int lendingLength, int rating, String subject,
			int volumeNumber, String publication) {
		super(title, dateOfRelease, lendingLength, rating);
		this.subject = subject;
		this.volumeNumber = volumeNumber;
		this.publication = publication;
	}

	void display()
	{
		super.display();
		System.out.println("Subject: " + subject + "\nVolume Number: " + volumeNumber + "\nPublication: " + publication);
	}
	
}
