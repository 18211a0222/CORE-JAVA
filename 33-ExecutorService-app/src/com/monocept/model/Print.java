package com.monocept.model;

public class Print implements Runnable{
	public void run()
	{
		System.out.println("The name of the Thread is " + Thread.currentThread().getName());
	}
}
