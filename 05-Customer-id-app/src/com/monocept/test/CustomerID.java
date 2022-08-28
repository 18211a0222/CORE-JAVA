package com.monocept.test;

import com.monocept.model.Customer;

public class CustomerID {

	public static void main(String[] args) {
		Customer c1 = new Customer("harsh",100);
		System.out.println(c1.getId());
		Customer c2 = new Customer("harsh",100);
		System.out.println(c2.getId());
		Customer c3 = new Customer("harsh",100);
		System.out.println(c3.getId());
		Customer c4 = new Customer("harsh",100);
		System.out.println(c4.getId());
	}

}
