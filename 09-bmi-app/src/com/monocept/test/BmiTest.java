package com.monocept.test;

import com.monocept.model.Bmi;
import com.monocept.model.Person;

public class BmiTest {

	public static void main(String[] args) {
		Person p1 = new Person("sai" , 35, 175, 75);
		Person p2 = new Person("kiran", 35, 175, 95);
		Person p3 = new Person("reddy", 35, 175, 35);
		Bmi obj = new Bmi(p1);
		Bmi obj2 = new Bmi(p2);
		Bmi obj3 = new Bmi(p3);
		System.out.println(obj.getBodyType());
		System.out.println(obj2.getBodyType());
		System.out.println(obj3.getBodyType());
		System.out.println(obj.getBmi());
		System.out.println(obj2.getBmi());
		System.out.println(obj3.getBmi());
		
	}

}
