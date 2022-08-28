package com.monocept.model;

public class Account {
	
	private double balance;
	private String username;
	private int id;
	
	public Account(double amount, String username, int id) {
		super();
		this.balance = amount;
		this.username = username;
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public String getUsername() {
		return username;
	}

	public int getId() {
		return id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", username=" + username + ", id=" + id + "]";
	}
	
	
	
	

}
