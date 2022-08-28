package com.monocept.model;

import java.util.Arrays;
import java.util.HashMap;

public class Cashier {
	
	private String[] items;
	private HashMap<String, Integer> prices;
	
	public Cashier(String[] items) {
		this.items = items;
		this.prices = getPrices();
	}
	
	private HashMap<String, Integer> getPrices() {
		 HashMap<String, Integer> prices = new HashMap<>();
	        prices.put("burger", 100);
	        prices.put("fries", 50);
	        prices.put("drink", 20);
	        prices.put("salad", 150);
		return prices;
	}

	public double getAmount()
	{
		return Arrays.stream(items).mapToDouble(elem -> prices.get(elem)).sum();
	}
	

}
