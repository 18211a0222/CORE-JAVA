package com.monocept.test;

import java.util.Arrays;
import java.util.Comparator;

public class StreamTestTask3 {

	public static void main(String[] args) {

		String[] names = { "jayesh", "somu", "sam", "mesh", "mahesh" };
		System.out.println("names of first 3 students sorted in ascending order : \n");
		Arrays.stream(names).sorted().limit(3).forEach(System.out::println);

		System.out.println("\nnames of first 3 students sorted in ascending order if their names contain 'a' \n");
		Arrays.stream(names).sorted().filter(n -> n.contains("a")).limit(3).forEach(System.out::println);

		System.out.println("\nnames of students sorted in descending order \n");
		Arrays.stream(names).sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("\nfirst 3 characters of names of students\r\n");
		Arrays.stream(names).forEach(n -> System.out.println(n.substring(0, 3)));

		System.out.println("\nnames of the students that contains less than or equal to 4 characters \n");
		Arrays.stream(names).filter(n -> n.length() <= 4).forEach(System.out::println);

	}

}
