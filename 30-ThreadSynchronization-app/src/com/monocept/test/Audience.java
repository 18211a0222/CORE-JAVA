package com.monocept.test;

import com.monocept.model.TheaterSeats;

public class Audience {
	
	public static void main(String args[])
	{
		TheaterSeats theater = new TheaterSeats(1);
		
		Thread ram = new Thread(theater,"ram");
		Thread raj = new Thread(theater, "raj");
		Thread ravi = new Thread(theater, "ravi");
		
		ram.start();
		raj.start();
		ravi.start();
	}
	

}
