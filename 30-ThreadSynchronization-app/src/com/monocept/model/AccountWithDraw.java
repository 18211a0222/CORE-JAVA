package com.monocept.model;

public class AccountWithDraw implements Runnable {
	
	double amount;
	Account temporary;
	
	public AccountWithDraw(double amount, Account temporary) {
		super();
		this.amount = amount;
		this.temporary = temporary;
	}

	@Override
	public void run() {
		
		if(temporary.getBalance() >= amount) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			//System.out.println("The account balance is " + temporary.getBalance());
			temporary.setBalance(temporary.getBalance() - amount); 
			System.out.println("The account balance is " + temporary.getBalance());	
		}
		else {
			System.out.println("Insufficient credits");
		}
	}

}
