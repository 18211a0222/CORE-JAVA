package com.monocept.test;

public class ExceptionProp {

	public static void main(String[] args) throws Exception {
		
		method1();
		System.out.println("Inside main method");

	}

	public static void method1(){
		method2();
		System.out.println("Inside method1");
		
	}

	public static void method2(){
		try {
		method3();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		System.out.println("Inside method2");
		
	}

	public static void method3() throws Exception {
		throw new Exception();
		//System.out.println("Inside method3");
		
	}

}
