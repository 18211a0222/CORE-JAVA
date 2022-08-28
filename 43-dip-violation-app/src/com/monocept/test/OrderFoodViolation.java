package com.monocept.test;

import com.monocept.model.OrderFood;
import com.monocept.model.PaytmPayment;

public class OrderFoodViolation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] order = {"fries", "burger", "drink"};
		OrderFood newOrder = new OrderFood(order, new PaytmPayment());
		newOrder.process();
		
	}

}
