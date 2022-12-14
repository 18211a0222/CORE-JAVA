package com.monocept.model;

public class Employee implements Cloneable{
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}	
	
	@Override
	public Object clone() throws CloneNotSupportedException {  
	// TODO Auto-generated method stub  
	return super.clone();  
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}  
	
	
}
