package com.training.polymorphism;

public class Fan extends Items{

	@Override
	public int getSerialNumber() {
		return 1;
	}

	@Override
	public String getItemName() {
		return "Bajaj";
	}

	@Override
	public int getRentalCharge() {
		return 100;
	}
}
