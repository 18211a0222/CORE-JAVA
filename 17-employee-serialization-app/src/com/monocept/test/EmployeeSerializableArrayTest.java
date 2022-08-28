package com.monocept.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.monocept.model.Employee;

public class EmployeeSerializableArrayTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee(100,"sakkkm",2000);
		Employee emp1 = new Employee(101,"ram",2050);
		Employee emp2 = new Employee(102,"cam",6000);
		Employee emp3 = new Employee(103,"shyam",7000);
		Employee emp4 = new Employee(104,"tom",2350);
		Employee array[] = {emp,emp1,emp2,emp3,emp4};
		
		
		try {
			FileOutputStream file = new FileOutputStream("./lib/arraytext");
			
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(array);
			out.close();
			file.close();
			System.out.println("execute");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
