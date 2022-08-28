package com.monocept.model;

public class GpayPayment implements Payment{
	
	public void handlePayment(double amount)
	{
		System.out.println("Charging " + amount + " using GooglePay");
	}

}
