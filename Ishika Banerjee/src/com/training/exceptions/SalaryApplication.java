package com.training.exceptions;

import java.util.Scanner;

public class SalaryApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Employee: ");
		String empName = sc.next();
		System.out.println("Enter Employee ID: ");
		String empId = sc.next();
		System.out.println("For Employee Type,\nPress 1 for Unskilled Employee\n2 for Semi Skilled Employee\n3 for Skilled Employee");
		int empType = Integer.parseInt(sc.next());
		System.out.println("Enter Salary: Rs.");
		double salary = Double.parseDouble(sc.next());
		sc.close();
		
		try
		{
			new Employee(empName, empId, empType, salary);	
		}catch(EmployeeException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
