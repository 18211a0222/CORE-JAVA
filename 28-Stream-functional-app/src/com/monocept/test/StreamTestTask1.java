package com.monocept.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTestTask1 {

	public static void main(String[] args) {

//		Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50);
		
		//stream.forEach(System.out::println);
		
//		List<String> employees = Arrays.asList("ram","cam","bam","shyam");
//		
//		employees.stream().forEach(System.out::println);
		
//		List<Integer> allNumbers = Arrays.asList(10,20,30,40,23,35,5,67);
//		List<Integer> evenNumbers = new ArrayList<>();
//		
//		for(int n : allNumbers)
//		{
//			if(n % 2 == 0)
//				evenNumbers.add(n);
//		}
		
		//System.out.println(evenNumbers);
		
		String[] names = {"jayesh" , "ram", "syam", "ramesh", "mahesh"};
		
		System.out.println("using names.stream().forEach \n");
		//Arrays.asList(names).stream().forEach(System.out::println);
		Arrays.stream(names).forEach(System.out::println);
		
		System.out.println("\nusing Arrays.asList(names).forEach \n");
		Arrays.asList(names).forEach(n -> System.out.println(n));
		//Arrays.asList(names).forEach(System.out::println);
		
		System.out.println("\nusing static reference method\n");
		Stream<String> streamNames = Arrays.stream(names);
		streamNames.forEach(System.out::println);
		
		
	}

}
