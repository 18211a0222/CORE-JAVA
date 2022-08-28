package com.monocept.model;

public class OrderFood {
	
	private Payment payment;
	private String[] items;
	
	public OrderFood(String[] items, Payment payment) {
		super();
		this.payment = payment;
		this.items = items;
	}

	public Payment getPayment() {
		return payment;
	}

	public String[] getItems() {
		return items;
	}
	
	public void process()
	{
		Cashier cashier = new Cashier(items);
		System.out.println("your bill for the order is " + cashier.getAmount());
		payment.handlePayment(cashier.getAmount());
		System.out.println("Thank you for coming");
	}
	

	
}
