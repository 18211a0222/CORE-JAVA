package com.monocept.model;

public class SavingAccount extends Account{
	
	private static final int MIN_BAL = 5000;

	public SavingAccount(int accNumber, String name, double balance) {
		super(accNumber, name, balance);
	}
	
	@Override
	public void withDraw(double amount)
	{
		if(getBalance() - amount > MIN_BAL)
			this.setBalance(this.getBalance() - amount);
		else
			System.out.println("insufficient credits");
	}
	

}
