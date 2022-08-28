package com.monocept.test;

import com.monocept.model.Calendar;
import com.monocept.model.IPrintable;

public class PrintTest {

	public static void main(String[] args) {

		IPrintable calendar = new Calendar();
		calendar.printGreetings();

		IPrintable diary = new IPrintable() {
			@Override
			public void printGreetings() {
				// TODO Auto-generated method stub
				System.out.println("haaa");

			}
		};
		
		diary.printGreetings();
		
		IPrintable book = () -> {
			System.out.println("hummmmmmmmmm");
		};
		
		book.printGreetings();
		
		IPrintable ref = PrintTest :: displayMessage;
		ref.printGreetings();
	}
	
	public static void displayMessage()
	{
		System.out.println("displaying message");
	}

}
