package com.monocept.test;

import com.monocept.exception.InsufficientBalanceException;
import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		Account a1 = new Account(1,"a", 100);
		Account a2 = new Account(2,"b", 500);
		Account a3 = new Account(3,"c", 300);
		Account a4 = new Account(4,"d", 600);
		Account a5 = new Account(5,"e", 10);
		Account accounts[] = {a1,a2,a3,a4,a5};
		
		try {
			a2.withDraw(500);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(a1.getMaxBalanceAccount(accounts));
		

	}

}
