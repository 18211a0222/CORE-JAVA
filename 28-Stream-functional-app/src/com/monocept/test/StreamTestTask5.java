package com.monocept.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTestTask5 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70,25,35,45);
		
		int max = numbers.stream().max(Comparator.naturalOrder()).get();
		System.out.println("max element is " + max);
		
		Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());
		System.out.println("min element is " + min.get());
		
	}

}
