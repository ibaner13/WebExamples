package com.training.designing;

import java.util.Scanner;

public class TaxWhizApplication {

	public static void main(String[] args) {

		TaxWhiz twObj = new TaxWhiz();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter purchase amount: ");
		double amount = Double.parseDouble(in.next());
		System.out.println("Tax is: " + twObj.calcTax(amount));
		in.close();
		
	}

}
