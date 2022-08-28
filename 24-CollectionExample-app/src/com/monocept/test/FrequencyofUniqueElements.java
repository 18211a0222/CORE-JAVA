package com.monocept.test;

import java.util.*;

public class FrequencyofUniqueElements {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>(
				Arrays.asList(18, 2, 2, 2, 4, 2, 32, 3, 3, 4, 10, 6, 6, 9, 100, 10, 20));

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : numbers) {
			if (map.containsKey(i)) {
				map.replace(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		HashMap<Integer, Integer> frequencyCount = new HashMap<>();
		for (int i : numbers) {
			frequencyCount.putIfAbsent(i, Collections.frequency(numbers, i));
		}
		
		System.out.println(map);
		System.out.println(frequencyCount);


	}

}
