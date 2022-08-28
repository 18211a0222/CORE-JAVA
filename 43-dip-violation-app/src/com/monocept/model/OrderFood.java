package com.monocept.model;

import java.util.HashMap;

public class OrderFood {
	
	private PaytmPayment paytm;
	private String[] items;
	private HashMap<String, Integer> prices;
	private double amount;
	
	public OrderFood(String[] items, PaytmPayment paytm) {
		super();
		this.paytm = paytm;
		this.items = items;
		this.prices = getPrices();
		this.amount = getAmount();
	}

	private HashMap<String, Integer> getPrices() {
		 HashMap<String, Integer> prices = new HashMap<>();
	        prices.put("burger", 100);
	        prices.put("fries", 50);
	        prices.put("drink", 20);
	        prices.put("salad", 150);
		return prices;
	}

	public PaytmPayment getPaytm() {
		return paytm;
	}

	public String[] getItems() {
		return items;
	}
	
	public double getAmount()
	{
		int amount = 0;
		for(String elem : items)
		{
			amount = amount + prices.get(elem);
		}
		return amount;
	}
	
	public void process()
	{
		System.out.println("your bill for the order is " + amount);
		paytm.handlePayment(amount);
		System.out.println("Thank you for coming");
	}
	

	
}
