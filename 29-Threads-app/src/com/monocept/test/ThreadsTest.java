package com.monocept.test;

import com.monocept.model.Alphabets;
import com.monocept.model.Numbers;

public class ThreadsTest {

	public static void main(String[] args) {
//		Alphabets AlphaThread = new Alphabets();
//		AlphaThread.start();
//		
//		Numbers NumObj = new Numbers();
//		Thread NumThread = new Thread(NumObj);
//		NumThread.start();
//		System.out.println("in main");

		Runnable anonyObj = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (char ch = 'A'; ch <= 'Z'; ch++) {
					System.out.println(ch);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread anonyThread = new Thread(anonyObj);
		anonyThread.start();

		Runnable lambdaObj = () -> {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				System.out.println(ch);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread lambdaThread = new Thread(lambdaObj);
		lambdaThread.start();
		Thread lambdaThread2 = new Thread(lambdaObj);
		lambdaThread2.start();

		Runnable refObj = ThreadsTest::NumbersThread;
		Thread refThread = new Thread(refObj);
		refThread.start();
		
	}

	public static void NumbersThread() {
		for (int i = 1; i <= 26; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
