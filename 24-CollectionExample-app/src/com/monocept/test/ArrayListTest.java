package com.monocept.test;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		// create list of String
		List<String> persons = new ArrayList<>();

		// add elements to back of the list
		persons.add("ram");
		persons.add("shyam");
		persons.add("kiran");
		System.out.println(persons); // ["ram", "shyam", "kiran"]

		// insert element at specified position
		persons.add(1, "ravindar");
		System.out.println(persons); // ["ram", "ravindar", "shyam", "kiran"]

		// get specific element by index(index starts from 0)
		String str = persons.get(2);
		System.out.println(str); // shyam

		// find out number of elements in the list
		int size = persons.size();
		System.out.println("Size: " + size); // 4

		// remove by index
		persons.remove(0);
		System.out.println(persons); // ["ravindar", "shyam", "kiran"]

		// remove by value
		persons.remove("kiran");
		System.out.println(persons); // ["ravindar", "shyam"]

		// find index of specific element
		int index = persons.indexOf("shyam");
		System.out.println(index); // 1

		// check if list contains specified element
		boolean isThere = persons.contains("ram");
		System.out.println(isThere); // false
	}
}
