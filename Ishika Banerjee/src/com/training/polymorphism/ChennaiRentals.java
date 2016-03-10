package com.training.polymorphism;

public class ChennaiRentals {

	int days,quantity;
	public static int total=0;
	
	public ChennaiRentals(int days,int quantity) {
		super();
		this.days = days;
		this.quantity = quantity;
	}

	public Items getItems(int key) {
		switch (key) {
		case 1:
			return new Fan();
		case 2:
			return new Furniture();
		case 3:
			return new AC();
		case 4:
			return new Vessel();
		default:
			break;
		}
		return null;
	}
	
	public void printDetails(Items item) {
		System.out.println("~~~~Item Details~~~~");
		System.out.println("Serial Number:"+item.getSerialNumber());
		System.out.println("Item Name:"+item.getItemName());
		System.out.println("Rental Charge:"+item.getRentalCharge()*days*quantity+"\n");
	}
	public int getRent(Items item) {
		return item.getRentalCharge()*days*quantity;
	}
}
