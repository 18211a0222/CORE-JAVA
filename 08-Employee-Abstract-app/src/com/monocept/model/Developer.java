package com.monocept.model;

public class Developer extends Employee{
	
	private double hra;
	private double da;
	private double ta;
	
	public Developer(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		this.hra = (30 * getBasicSalary())/100;
		this.da = (20 * getBasicSalary())/100;
		this.ta = (10 * getBasicSalary())/100;
	}

	@Override
	public double calculateTotalCTC() {
		return hra + da + ta + getBasicSalary();		
	}

	@Override
	public String toString() {
		return " EmployeeId = " + getEmployeeId() + "\n Name = " + getName() + "\n BasicSalary = " + getBasicSalary() 
		+ "\n hra = " + hra + "\n da = " + da + "\n ta = " + ta + "\n CTC = " + calculateTotalCTC();
	}


	
	
}

