package com.monocept.model;

public class CurrentAccount extends Account{
	
	private static final int OVER_DRAFT = 50000;

	public CurrentAccount(int accNumber, String name, double balance) {
		super(accNumber, name, balance);
	}
	
	@Override
	public void withDraw(double amount)
	{
		if(Math.abs(getBalance() - amount) < OVER_DRAFT)
			this.setBalance(this.getBalance() - amount);
		else
			System.out.println("insufficient credits");
	}

}
