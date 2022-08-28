package com.monocept.test;

import com.monocept.model.FestivalType;
import com.monocept.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FixedDeposit account1 = new FixedDeposit("ram", 10000, 2, FestivalType.EID);
		FixedDeposit account2 = new FixedDeposit("shyam", 10000, 2);
		
		System.out.println("the SimpleInterest for " + account1.getName() + " is : " + account1.calculateSimpleInterest());
		System.out.println("the SimpleInterest for " + account2.getName() + " is : " + account2.calculateSimpleInterest());
		

	}

}
