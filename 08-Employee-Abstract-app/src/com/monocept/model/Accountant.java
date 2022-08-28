package com.monocept.model;

public class Accountant extends Employee{
	
	private double perks;
	
	public Accountant(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		this.perks = (30 * getBasicSalary())/100;
	}

	@Override
	public double calculateTotalCTC() {
		return perks + getBasicSalary();
	}

	@Override
	public String toString() {
		return " EmployeeId = " + getEmployeeId() + "\n Name = " + getName() + "\n BasicSalary = " + getBasicSalary() 
		+ "\n perks = " + perks + "\n CTC = " + calculateTotalCTC();
	}

	

}
