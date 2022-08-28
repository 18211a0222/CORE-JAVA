package com.monocept.test;

import com.monocept.model.Account;
import com.monocept.model.Employee;
import com.monocept.model.HR;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(12, "ram", "hyderabad", "02/10/2010", 20000);
		Employee emp2 = new Employee(13, "shyam", "bangalore", "03/08/2015", 30000);
		Employee emp3 = new Employee(14, "sam", "chennai", "07/12/2020", 15000);
		
		HR hr = new HR();
		System.out.print(hr.isPromotionDue(emp1) + "\n");
		System.out.print(hr.isPromotionDue(emp2) + "\n");
		System.out.print(hr.isPromotionDue(emp3) + "\n");
		
		System.out.println();
		
		Account accountant = new Account();
		System.out.print(accountant.calculateAnnualIncome(emp1) + "\n");
		System.out.print(accountant.calculateAnnualIncome(emp2) + "\n");
		System.out.print(accountant.calculateAnnualIncome(emp3) + "\n");
		
		
		

	}

}
