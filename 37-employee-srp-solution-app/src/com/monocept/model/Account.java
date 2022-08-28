package com.monocept.model;

public class Account {
	
	public double calculateAnnualIncome(Employee emp)
	{
		System.out.print("The annual income of " + emp.getName() + " is : ");
		return emp.getSalary() * 12;
	}

}
