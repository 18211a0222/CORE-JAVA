package com.monocept.test;

import com.monocept.model.IEat;
import com.monocept.model.IWork;
import com.monocept.model.Robot;
import com.monocept.model.Supervisior;

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
		

	}

	public static void atTheWorkStation(IWork worker) {
		worker.startWork();
		worker.stopWork();
	}

	public static void atTheCafe(IEat worker) {
		worker.startEat();
		worker.stopEat();
	}

}
