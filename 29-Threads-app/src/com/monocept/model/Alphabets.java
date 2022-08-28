package com.monocept.model;

public class Alphabets extends Thread{
	
	@Override
	public void run()
	{
		for(char ch = 'A'; ch <= 'Z'; ch++)
		{
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
