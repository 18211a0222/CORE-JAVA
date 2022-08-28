package com.monocept.test;

import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		
		SavingAccount a2 = new SavingAccount(1,"cam",10000);
		a2.withDraw(6000);
		System.out.println(a2 + "\n");
		
		a2.withDraw(4000);
		System.out.println(a2 + "\n");
		CurrentAccount a3 = new CurrentAccount(2,"ram",10000);
		
		a3.withDraw(20000);
		System.out.println(a3 + "\n");
		
		a3.withDraw(30000);
		System.out.println(a3 + "\n");
		

	}

}
