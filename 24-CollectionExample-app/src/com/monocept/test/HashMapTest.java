package com.monocept.test;

import java.util.HashMap;

class HashMapTest {
	public static void main(String[] args) {

		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1, "Hindi");
		languages.put(2, "English");
		languages.put(3, "Telugu");
		System.out.println("HashMap: " + languages); // HashMap: {1=Hindi, 2=English, 3=Telugu}

		// get() method to get value
		String value = languages.get(1);
		System.out.println("Value at index 1: " + value); //Value at index 1: Hindi

		// return set view of keys
		// using keySet()
		System.out.println("Keys: " + languages.keySet()); // Keys: [1, 2, 3]

		// return set view of values
		// using values()
		System.out.println("Values: " + languages.values()); // Values: [Hindi, English, Telugu]

		// return set view of key/value pairs
		// using entrySet()
		System.out.println("Key/Value mappings: " + languages.entrySet()); // Key/Value mappings: [1=Hindi, 2=English, 3=Telugu]

		// change element with key 2
		languages.replace(2, "Kannada");
		System.out.println("HashMap using replace(): " + languages); // HashMap using replace(): {1=Hindi, 2=Kannada, 3=Telugu}

		// remove element associated with key 2
		String value2 = languages.remove(2);
		System.out.println("Removed value: " + value2); // Removed value: Kannada

		System.out.println("Updated HashMap: " + languages); // Updated HashMap: {1=Hindi, 3=Telugu}
	}
}