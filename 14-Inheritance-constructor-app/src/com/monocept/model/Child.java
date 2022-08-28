package com.monocept.model;

public class Child extends Parent{
	String message;
	
	public Child(String message)
	{	
		super(message);
		System.out.println("Inside child class " + message);
	}
}
