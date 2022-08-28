package com.monocept.test;

import com.monocept.model.Account;
import com.monocept.model.AccountWithDraw;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account jointAccount = new Account(3000, "ram-raj-ravi", 123);
		
		Runnable withDraw1 = new AccountWithDraw(3000, jointAccount);
		Runnable withDraw2 = new AccountWithDraw(3000, jointAccount);
		Runnable withDraw3 = new AccountWithDraw(3000, jointAccount);
		
		Thread ram = new Thread(withDraw1);
		Thread raj = new Thread(withDraw2);
		Thread ravi = new Thread(withDraw3);
		
		ram.start();
		raj.start();
		ravi.start();

	}

}
