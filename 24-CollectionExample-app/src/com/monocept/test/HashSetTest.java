package com.monocept.test;

import java.util.*;

class HashSetTest {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");
		System.out.println("An initial list of elements: " + set); //An initial list of elements: [Vijay, Ravi, Arun, Sumit]
		
		// Removing specific element from HashSet
		set.remove("Ravi");
		System.out.println("After invoking remove(object) method: " + set); //After invoking remove(object) method: [Vijay, Arun, Sumit]
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		set.addAll(set1);
		System.out.println("Updated List: " + set); //Updated List: [Vijay, Arun, Gaurav, Sumit, Ajay]
		// Removing all the new elements from HashSet
		set.removeAll(set1);
		System.out.println("After invoking removeAll() method: " + set); //After invoking removeAll() method: [Vijay, Arun, Sumit]
		
		// Removing elements on the basis of specified condition
		set.removeIf(str -> str.contains("Vijay"));
		System.out.println("After invoking removeIf() method: " + set); // After invoking removeIf() method: [Arun, Sumit]
		// Removing all the elements available in the set 
		set.clear();
		System.out.println("After invoking clear() method: " + set); //After invoking clear() method: []
	}
}