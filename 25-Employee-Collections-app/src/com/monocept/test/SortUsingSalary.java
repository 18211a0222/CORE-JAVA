package com.monocept.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import com.monocept.model.Employee;

public class SortUsingSalary {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "ram", 35000);
		Employee emp2 = new Employee(2, "zam", 25000);
		Employee emp3 = new Employee(3, "tom", 15000);
		Employee emp4 = new Employee(4, "dam", 30000);
		Employee emp5 = new Employee(5, "wam", 40000);
		Employee emp6 = new Employee(6, "bam", 17000);
		Employee emp7 = new Employee(7, "cam", 20000);
		Employee emp8 = new Employee(8, "qam", 90000);
		Employee emp9 = new Employee(9, "yam", 23000);
		Employee emp10 = new Employee(0, "jam", 50000);

		ArrayList<Employee> employees = new ArrayList<>(
				Arrays.asList(emp6, emp5, emp4, emp3, emp2,emp7,emp8,emp9,emp10,emp1));
		
		EmployeeComparator comp = new EmployeeComparator();
		Collections.sort(employees, comp);
		//System.out.println(comp.getCount());
		
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		
		System.out.println();
		
		employees.sort(Comparator.comparing(Employee :: getSalary).reversed());
		
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		System.out.println();
		
		Collections.sort(employees, Comparator.comparing(Employee::getSalary));

		for (Employee emp : employees) {
			System.out.println(emp);
		}	


	}

}
