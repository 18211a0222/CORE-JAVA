package com.monocept.test;

import com.monocept.model.GpayPayment;
import com.monocept.model.OrderFood;
import com.monocept.model.PaytmPayment;

public class OrderFoodSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] order = {"fries", "burger", "drink"};
		OrderFood newOrder = new OrderFood(order, new PaytmPayment());
		OrderFood newOrder2 = new OrderFood(order, new GpayPayment());
		newOrder.process();
		newOrder2.process();
		
	}

}
