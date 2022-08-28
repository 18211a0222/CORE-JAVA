package com.monocept.model;

public class Manager extends Employee{
	
	private double pa;
	private double ota;
	
	public Manager(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		this.pa = (25 * getBasicSalary())/100;
		this.ota = (10 * getBasicSalary())/100;
	}

	@Override
	public double calculateTotalCTC() {
		return pa +  ota + getBasicSalary();		
	}

	@Override
	public String toString() {
		return  " EmployeeId = " + getEmployeeId() + "\n Name = " + getName() + "\n BasicSalary = " + getBasicSalary() 
		+ "\n pa = " + pa + "\n ota = " + ota + "\n CTC = " + calculateTotalCTC();
	}
	
	

}
