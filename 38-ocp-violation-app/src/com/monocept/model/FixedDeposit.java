package com.monocept.model;

public class FixedDeposit {

	private String name;
	private double principle;
	private int duration;
	private IFestival festival;

	public FixedDeposit(String name, double principle, int duration, IFestival festival) {
		super();
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}

	public String getName() {
		return name;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getDuration() {
		return duration;
	}

	public IFestival getFestival() {
		return festival;
	}

	public double calculateSimpleInterest() {
		return (principle * festival.getInterestrates() * duration) / 100;
	}

}
