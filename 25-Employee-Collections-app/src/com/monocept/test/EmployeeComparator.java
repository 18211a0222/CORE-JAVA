package com.monocept.test;

import java.util.Comparator;

import com.monocept.model.Employee;

public class EmployeeComparator implements Comparator<Employee> {

	private static int count = 0;
	
	@Override
	public int compare(Employee o1, Employee o2) {
		//count += 1;
		//System.out.println(o1.getSalary().compareTo(o2.getSalary()));
		if(o1.getSalary() > o2.getSalary())
		{
			return 1;
		}
		else if(o1.getSalary() == o2.getSalary())
		{
			return 0;
		}
		return -1;
		//return o1.getSalary().compareTo(o2.getSalary());
	}
	
	public int getCount()
	{
		return count;
	}
	
	
}
