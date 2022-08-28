package com.monocept.model;

public class FixedDeposit {

	private String name;
	private double principle;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(String name, double principle, int duration, FestivalType festival) {
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}

	public FixedDeposit(String name, double principle, int duration) {
		this(name,principle,duration,FestivalType.OTHERS);
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

	public FestivalType getFestival() {
		return festival;
	}

	public double getInterestrates() {
		switch (festival) {
		case EID:
			return 8;
		case NEWYEAR:
			return 12;
		case DIWALI:
			return 26;
		case CHRISTMAS:
			return 20;
		default:
			return 30;
		}
	}

	public double calculateSimpleInterest() {
		return (principle * getInterestrates() * duration) / 100;
	}

}
