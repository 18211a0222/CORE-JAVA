package com.monocept.model;

public class TheaterSeats extends Thread{
	
	private int seatsAvailable;

	public TheaterSeats(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	
	@Override
	public void run()
	{
		
		synchronized(this)
		{
		if(getSeatsAvailable() > 0)
		{
			setSeatsAvailable(getSeatsAvailable() - 1);
			System.out.println("Seat is reserved for " + Thread.currentThread().getName() );

		}
		else {
			System.out.println("Seat is not available");
		}
		}
	}
	
	
	
	
	

}
