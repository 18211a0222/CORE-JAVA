package com.monocept.test;

import com.monocept.model.Diwali;
import com.monocept.model.Eid;
import com.monocept.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FixedDeposit account1 = new FixedDeposit("ram", 10000, 2, new Diwali());
		FixedDeposit account2 = new FixedDeposit("shyam", 10000, 2, new Eid());
		
		System.out.println("the SimpleInterest for " + account1.getName() + " is : " + account1.calculateSimpleInterest());
		System.out.println("the SimpleInterest for " + account2.getName() + " is : " + account2.calculateSimpleInterest());
		

	}

}
