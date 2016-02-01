package com.training.polymorphism;

import java.util.Scanner;

public class ChennaiRentalsApplication {

	public static void main(String[] args) {


		Items item = null;
		int key = 0;
		Scanner sin = new Scanner(System.in);
		do{
		System.out.println("Enter the Serial Number: (1.Fan\n2.Furniture\n3.AC\n4.Vessels) Press 4 to exit"); 
		key = sin.nextInt();
		if(key >= 4) break;
		System.out.println("Enter the number of days:");
		int days = sin.nextInt();
		System.out.println("Enter the quantity:");
		int quantity = sin.nextInt();
				ChennaiRentals crObj = new ChennaiRentals(days,quantity);
		
		item = crObj.getItems(key);
		crObj.printDetails(item);
		
		ChennaiRentals.total += crObj.getRent(item);
		
		}while(true);
		System.out.println("Your total Rental Charge is:" + ChennaiRentals.total + "/-");
		sin.close();
	}

}
