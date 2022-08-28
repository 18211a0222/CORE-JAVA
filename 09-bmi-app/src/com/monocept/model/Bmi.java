package com.monocept.model;

public class Bmi {
	private double bmi;
	private Person person;
	
	public Bmi(Person person) {
		this.person = person;
		bmi = CalculateBmi();
	}
	
	private double CalculateBmi() {
		return (person.getWeight() / Math.pow((double)person.getHeight()/100,2));
	}
	
	public String getBodyType() {
		if(bmi < 18.5)
		{
			return "Underweight";
		}
		else if(bmi > 18.5 && bmi < 24.9)
		{
			return "Normal healthy weight";	
		}
		return "Overweight ";
	}
	
	public double getBmi()
	{
		return bmi;
	}

}
