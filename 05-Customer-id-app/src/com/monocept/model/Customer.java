package com.monocept.model;

public class Customer {
	
	private String id;
	private String name;
	private int credits;
	private static int counter = 0;
	
	public Customer(String name, int credits) {
		this.name = name;
		this.credits = credits;
		this.id = generateId();
		counter++;
	}

	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}
	
	public String getId() {
		return id;
	}
	
	public String generateId() {
		int max = 100,min = 1;
		int random = (int)(Math.random()*(max-min+1)+min);  
		return "Customer" + random + counter; 
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", credits=" + credits + "]";
	}
	
	
	
	
	
	

}
