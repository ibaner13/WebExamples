package com.training.polymorphism;

public class AC extends Items{

	@Override
	public int getSerialNumber() {
		return 3;
	}

	@Override
	public String getItemName() {
		return "Hitachi";
	}

	@Override
	public int getRentalCharge() {
		return 1000;
	}
}
