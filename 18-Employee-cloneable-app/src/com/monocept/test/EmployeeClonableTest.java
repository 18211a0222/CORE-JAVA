package com.monocept.test;

import com.monocept.model.Employee;

public class EmployeeClonableTest{

	public static void main(String[] args) {

		Employee emp = new Employee(1, "ram", 20000);
		
		System.out.println(emp);
		try {
			Employee emp1 = (Employee) emp.clone();
			System.out.println(emp1);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error" + emp.toString());
		}
	}

}
