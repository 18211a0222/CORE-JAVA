package com.monocept.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.monocept.model.Print;

public class ExecutorServiceTest {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++)
		{
			Thread thread = new Thread(new Print());
			thread.start();
		}
//		
//		ExecutorService newService = Executors.newFixedThreadPool(10);
//		
//		for(int i = 0; i < 100; i++)
//		{
//			newService.execute(new Print());
//		}
		
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount);

	}
	
}
