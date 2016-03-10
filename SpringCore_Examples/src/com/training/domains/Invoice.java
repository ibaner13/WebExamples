package com.training.domains;

import java.util.HashMap;
import java.util.List;

public class Invoice {

	private Customer cust;
	private long invoiceNumber;
	private double amount;

	private List<Item> itemList;
	
	private HashMap<String, Double> taxes;
	
	public HashMap<String, Double> getTaxes() {
		return taxes;
	}

	public void setTaxes(HashMap<String, Double> taxes) {
		this.taxes = taxes;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public Invoice() {
		super();
	}

	public Invoice(Customer cust, long invoiceNumber, double amount) {
		super();
		this.cust = cust;
		this.invoiceNumber = invoiceNumber;
		this.amount = amount;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public long getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	// Using autowiring

}
