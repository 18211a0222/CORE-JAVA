package com.monocept.test;

import java.util.HashSet;

import com.monocept.model.Employee;

public class EmployeeTest{

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "ram", 20000);
		Employee emp2 = new Employee(2, "syam", 25000);
		Employee emp3 = new Employee(1, "ram", 20000);
		
		HashSet<Employee> employees = new HashSet<>();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		System.out.println(employees);
		
	}

}
