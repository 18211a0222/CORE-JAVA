package com.monocept.test;

import com.monocept.model.Addition;
import com.monocept.model.IAddable;

public class PrintTest {

	public static void main(String[] args) {

		IAddable adder = new Addition();
		System.out.println("Using the interface implemented Addition class " + adder.AddNumbers(4, 5));

		IAddable anonymousAdder = new IAddable() {
			@Override
			public int AddNumbers(int a, int b) {
				return a + b;
			}
		};
		
		System.out.println("Using anonymous class " + anonymousAdder.AddNumbers(4,5));
		
		IAddable lambdaAdder = (a, b) -> a + b;
		
		System.out.println("Using lambda function " + lambdaAdder.AddNumbers(4,5));
		
		IAddable classAdder = new PrintTest() :: displayAddition;
		System.out.println("Using non static method reference " + classAdder.AddNumbers(4,5));
		
		IAddable StaticclassAdder = PrintTest :: StaticAddition;
		System.out.println("Using static method reference " + StaticclassAdder.AddNumbers(4, 5));
		
		
	}

	public int displayAddition(int a, int b) {
		return a + b;
	}
	
	public static int StaticAddition(int a, int b)
	{
		return a + b;
	}
}
