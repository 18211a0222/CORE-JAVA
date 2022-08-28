package com.monocept.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.monocept.model.Employee;

public class EmployeHashMapTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "ram", 20000);
		Employee emp2 = new Employee(2, "zam", 25000);
		Employee emp3 = new Employee(3, "tom", 30000);
		Employee emp4 = new Employee(4, "dam", 35000);
		Employee emp5 = new Employee(5, "wam", 40000);
		Employee emp6 = new Employee(6, "bam", 45000);

		ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(emp6, emp5, emp4, emp3, emp2, emp1));

		HashMap<Integer, String> map = new HashMap<>();

		for (Employee i : employees) {
			map.put(i.getId(), i.getName());
		}

		// System.out.println(map + "\n");

		//using ket set of the HashMap
		for (int key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}

		System.out.println();

		//using entry set of the HashMap
		for (Entry<Integer, String> entries : map.entrySet()) {
			System.out.println(entries);
			//System.out.println(entries.getKey() + " : " + entries.getValue());
		}

		System.out.println();

		//using forEach from the HashMap
		map.forEach((key, value) -> System.out.println(key + " : " + value));

		System.out.println();

		//using iterator on entry set
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		System.out.println();
		
		//using iterator on key set
		Iterator<Integer> iter = map.keySet().iterator();

		while (iter.hasNext()) {
			int entry = iter.next();
			System.out.println("Key = " + entry + ", Value = " + map.get(entry));
		}

	}

}
