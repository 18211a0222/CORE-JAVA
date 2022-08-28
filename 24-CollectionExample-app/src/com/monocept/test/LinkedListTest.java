package com.monocept.test;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		// create Linked list of String
		LinkedList<String> persons = new LinkedList<>();

		// add elements to back of the list
		persons.add("ram");
		// add elements to front of the list
		persons.addFirst("shyam");
		// add elements to back of the list
		persons.addLast("kiran");
		System.out.println(persons); // ["shyam", "ram", "kiran"]

		// insert element at specified position
		persons.add(1, "ravindar");
		System.out.println(persons); // ["shyam", "ravindar", "ram", "kiran"]

		// get specific element by index(index starts from 0)
		String str = persons.get(2);
		// get first element
		System.out.println(persons.getFirst()); // shyam
		// get last element
		System.out.println(persons.getLast()); // kiran
		System.out.println(str); // ram

		// find out number of elements in the list
		int size = persons.size();
		System.out.println("Size: " + size); // 4

		// remove by index
		persons.remove(0);
		persons.removeFirst(); // removes first element
		persons.removeLast(); // removes last element
		System.out.println(persons); // ["ram"]

		// remove by value
		persons.remove("ram");
		System.out.println(persons); // []

		// find index of specific element
		int index = persons.indexOf("shyam");
		System.out.println(index); // -1

		// check if list contains specified element
		boolean isThere = persons.contains("ram");
		System.out.println(isThere); // false
	}
}
