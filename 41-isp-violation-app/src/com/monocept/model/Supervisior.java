package com.monocept.model;

public class Supervisior implements IWorker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("supervisior started working");

		
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("supervisior stopped working");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		System.out.println("supervisior started eating");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		System.out.println("supervisior stopped eating");
	}
	
	
	
	

}
