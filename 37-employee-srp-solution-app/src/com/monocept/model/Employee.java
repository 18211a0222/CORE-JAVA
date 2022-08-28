package com.monocept.model;

public class Employee {

	private int id;
	private String name;
	private String city;
	private String doj;
	private double salary;

	public Employee(int id, String name, String city, String doj, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.doj = doj;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getDoj() {
		return doj;
	}

	public double getSalary() {
		return salary;
	}
}
