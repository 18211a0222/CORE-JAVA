package com.monocept.test;

import com.monocept.model.Rectangle;
import com.monocept.model.Square;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rect = new Rectangle(10,20);
		Square squ = new Square(10);
		
		isRectangle(rect);
		isRectangle(squ);
		
		
	}
	
	private static void isRectangle(Rectangle rect)
	{
		int before = rect.getHeight();
		rect.setWidth(50);
		int after = rect.getHeight();
		if(before == after)
			System.out.println("it is a rectangle");
		else
			System.out.println("it is not a rectangle");
	}

}
