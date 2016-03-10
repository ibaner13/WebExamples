package com.training.polymorphism;

public class Vessel extends Items{

	@Override
	public int getSerialNumber() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return "Vessel";
	}

	@Override
	public int getRentalCharge() {
		// TODO Auto-generated method stub
		return 200;
	}
	
}
