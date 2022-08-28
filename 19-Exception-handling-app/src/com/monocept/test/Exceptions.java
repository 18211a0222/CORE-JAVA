package com.monocept.test;

public class Exceptions {

	public static void main(String[] args) {
		
		int c = 0;
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			c = a/b;
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException Occured..");
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occured..");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occured..");
		}
		catch (RuntimeException e) {
			System.out.println("RuntimeException Occured..");
		}
		catch (Exception e) {
			System.out.println("Exception Occured..");
		}
		finally
		{
			System.out.println("Finally is executing");
		}
		System.out.println("division is " + c);
		

	}

}
