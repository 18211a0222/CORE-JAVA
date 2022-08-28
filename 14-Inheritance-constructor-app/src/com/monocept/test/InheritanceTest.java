package com.monocept.test;

import com.monocept.model.Child;

public class InheritanceTest {

	public static void main(String[] args) {
		//Child child = new Child("Hello");
		
		Object obj = 100;
		System.out.println(obj.getClass());
		obj = "Hello";
		System.out.println(obj.getClass());
		obj = (100 > 50);
		System.out.println(obj.getClass());
		
	}

}
