package com.monocept.model;

public class Printer {

	public void printInvoice(Invoice temp)
	{
		System.out.println("id : " + temp.getId());
		System.out.println("name : " + temp.getDescription());
		System.out.println("Total Tax : " + temp.getTotalTax());
		System.out.println("Total Discount : " + temp.getTotalDiscount());
		System.out.println("Total Amount :  " + temp.getTotalAmount());
	}

	
}
