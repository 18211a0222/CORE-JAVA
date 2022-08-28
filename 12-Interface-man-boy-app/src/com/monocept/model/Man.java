package com.monocept.model;

public class Man implements IEmotionable, IMannerable {

	@Override
	public void greet() {
		System.out.println("Man is greeting");

	}

	@Override
	public void depart() {
		System.out.println("Man is departing");

	}

	@Override
	public void cry() {
		System.out.println("Man is crying");

	}

	@Override
	public void laugh() {
		System.out.println("Man is laughing");

	}

}
