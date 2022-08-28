package com.monocept.test;

import com.monocept.model.Employee;
import com.monocept.model.Accountant;
import com.monocept.model.Developer;
import com.monocept.model.Manager;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee dev = new Developer(2,"abs",50000);
		Employee manager = new Manager(1,"ram",50000);
		Employee accountant = new Accountant(3,"shyam",50000);
		Printslip(dev);
		System.out.println();
		Printslip(manager);
		System.out.println();
		Printslip(accountant);
	}
	
	public static void Printslip(Employee emp)
	{
		System.out.println(emp);
	}
}
