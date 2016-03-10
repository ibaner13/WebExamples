package com.training.designing;

public class TaxWhiz {

	private double currentTaxRate;

	TaxWhiz()
	{
		currentTaxRate = .14;
	}
	
	public double calcTax (double purchase)
	{
		return purchase * currentTaxRate;
	}
}
