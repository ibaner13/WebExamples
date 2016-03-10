package com.training.domains;

public class Item {

	private int itemNumber;
	private String itemname;
	private double ratePerUnit;

	public Item() {
		super();
	}

	public Item(int itemNumber, String itemname, double ratePerUnit) {
		super();
		this.itemNumber = itemNumber;
		this.itemname = itemname;
		this.ratePerUnit = ratePerUnit;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	@Override
	public String toString() {
		return "Item [itemNumber: " + itemNumber + ", itemname: " + itemname + ", ratePerUnit: " + ratePerUnit + "]";
	}

}
