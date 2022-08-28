package com.monocept.model;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supervisior sup = new Supervisior();
		Robot robo = new Robot();

		atTheWorkStation(sup);

		System.out.println();

		atTheWorkStation(robo);

		System.out.println();

		atTheCafe(sup);
		
		System.out.println();
		
		atTheCafe(robo);

	}

	public static void atTheWorkStation(IWorker worker) {
		worker.startWork();
		worker.stopWork();
	}

	public static void atTheCafe(IWorker worker) {
		worker.startEat();
		worker.stopEat();
	}

}
