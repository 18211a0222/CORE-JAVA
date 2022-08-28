package com.monocept.model;

public class Invoice {

	private String id;
	private String description;
	private double amount;
	private double taxPercent;
	private double discountPercent;

	public Invoice(String id, String description, double amount, double taxPercent, double discountPercent) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.taxPercent = taxPercent;
		this.discountPercent = discountPercent;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public double getTaxPercent() {
		return taxPercent;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	private double calculateTax() {
		return (amount * taxPercent) / 100;
	}

	private double calculateDiscount() {
		return (amount * discountPercent) / 100;
	}

	private double calculateTotal() {
		return (amount - calculateTax() + calculateDiscount());
	}

	public void printInVoice() {
		System.out.println("id : " + getId());
		System.out.println("name : " + getDescription());
		System.out.println("Total Tax : " + calculateTax());
		System.out.println("Total Discount : " + calculateDiscount());
		System.out.println("Total Amount :  " + calculateTotal());
	}
}
