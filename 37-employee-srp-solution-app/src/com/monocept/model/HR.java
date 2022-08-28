package com.monocept.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HR {
	
	private final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public boolean isPromotionDue(Employee emp)
	{
		LocalDate employeeDoj = LocalDate.parse(emp.getDoj(), FORMATTER);
		LocalDate today = LocalDate.now();
		Period period = Period.between(employeeDoj, today);
		System.out.print("is promotion due for " + emp.getName() + " : ");
		if(period.getYears() >= 7)
			return true;
		return false;
	}
	
	
}
