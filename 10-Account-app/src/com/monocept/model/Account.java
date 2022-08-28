package com.monocept.model;

public class Account {
	
	private int accNumber;
	private String name;
	private double balance;
	
	public Account(int accNumber, String name, double balance) {
		
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public int getAccNumber() {
		return accNumber;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	
	public void withDraw(double amount)
	{
		if(balance > amount)
			this.balance -= amount;
		else
			System.out.println("insufficient credits");
	}
	
	public Account getMaxBalanceAccount(Account accounts[])
	{	
		double max = accounts[0].getBalance();
		int maxAccount = 0;
		for(int i = 1; i < accounts.length; i++)
		{
			if(max < accounts[i].getBalance())
			{
				max = accounts[i].getBalance();
				maxAccount = i;
			}
		}
		return accounts[maxAccount];
	}

	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

}
