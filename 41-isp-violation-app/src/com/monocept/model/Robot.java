package com.monocept.model;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("robot started working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("robot stopped working");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		throw new RuntimeException("Robots don't eat");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		throw new RuntimeException("Robots don't eat");
	}
	

}
