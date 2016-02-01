package com.training.exceptions;

public class EmployeeException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double salary;

	public EmployeeException(double salary) {
		super();
		this.salary = salary;
	}
	
	public String getMessage()
	{
		if (salary == 85000.00)
			return "Salary for unskilled employees should not be less than 85000";
		else if (salary == 95000.00)
			return "Salary for semi skilled employees should not be less than 95000";
		else if (salary == 105000.00)
			return "Salary for skilled employees should not be less than 105000";
		else return "In Range";
	}
}
