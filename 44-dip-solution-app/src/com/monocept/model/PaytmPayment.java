package com.monocept.model;

public class PaytmPayment implements Payment{
	
	public void handlePayment(double amount)
	{
		System.out.println("Charging " + amount + " using Paytm");
	}

}
