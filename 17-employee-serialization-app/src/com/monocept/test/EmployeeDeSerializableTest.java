package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.monocept.model.Employee;

public class EmployeeDeSerializableTest {

	public static void main(String[] args) {
		
		Employee emp = null;
		
		try {
			FileInputStream file = new FileInputStream("./lib/text");
			
			ObjectInputStream in = new ObjectInputStream(file);
			
			emp = (Employee) in.readObject();
			in.close();
			file.close();
			System.out.println(emp.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
