package com.monocept.test;

import com.monocept.model.Invoice;

public class InVoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice invoice = new Invoice("12","ram",1000, 10, 5);
		invoice.printInVoice();

	}

}
