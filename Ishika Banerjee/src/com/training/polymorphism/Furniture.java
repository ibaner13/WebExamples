package com.training.polymorphism;

public class Furniture extends Items{

	@Override
	public int getSerialNumber() {
		return 2;
	}

	@Override
	public String getItemName() {
		return "Godrej";
	}

	@Override
	public int getRentalCharge() {
		return 500;
	}
}
