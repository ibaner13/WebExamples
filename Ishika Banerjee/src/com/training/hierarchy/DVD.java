package com.training.hierarchy;

public class DVD extends MediaTypes {

	private double runningTime;
	private String production;

	public DVD(String title, String dateOfRelease, int lendingLength, int rating, double runningTime,
			String production) {
		super(title, dateOfRelease, lendingLength, rating);
		this.runningTime = runningTime;
		this.production = production;
	}

	void display()
	{
		super.display();
		System.out.println("Running Time: " + runningTime + "\nProduction: " + production);
	}
	
}
