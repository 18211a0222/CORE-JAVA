package com.monocept.test;

import com.monocept.model.Invoice;
import com.monocept.model.Printer;

public class InVoiceTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Invoice invoice = new Invoice("12","ram",1000, 10, 5);
		Invoice invoice2 = new Invoice("13","remo",1000, 15, 10);
		Printer print = new Printer();
		print.printInvoice(invoice);
		print.printInvoice(invoice2);

	}

}
