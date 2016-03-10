package com.training.exceptions;

public class Employee {

	private String empName;
	private String empId;
	private int empType;
	private double salary;
	public Employee(String empName, String empId, int empType, double salary) throws EmployeeException{
		super();
		if(empType == 1 && salary<85000.00)
		{
			throw new EmployeeException(85000.00);
		}
		else if(empType == 2 && salary<95000.00)
		{
			throw new EmployeeException(95000.00);
		}
		else if(empType == 3 && salary<105000.00)
		{
			throw new EmployeeException(105000.00);
		}
		else
		{
			this.empName = empName;
			this.empId = empId;
			this.empType = empType;
			this.salary = salary;	
			System.out.println("Salary of " + this.empName + " with ID " + this.empId + " is " + this.salary);
		}
	}
}
