package com.monocept.model;

public class Invoice {

	private String id;
	private String description;
	private double amount;
	private double taxPercent;
	private double discountPercent;
	private double totalAmount;
	private double totalDiscount;
	private double totalTax;

	public Invoice(String id, String description, double amount, double taxPercent, double discountPercent) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.taxPercent = taxPercent;
		this.discountPercent = discountPercent;
		this.totalTax = calculateTax();
		this.totalDiscount = calculateDiscount();
		this.totalAmount = calculateTotal();
		
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

	public double getTotalAmount() {
		return totalAmount;
	}

	public double getTotalDiscount() {
		return totalDiscount;
	}

	public double getTotalTax() {
		return totalTax;
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
	
}
