package com.monocept.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.monocept.model.Country;
import com.monocept.model.Region;

public class Main {

	public static void main(String[] args) throws Exception {

		ArrayList<Region> regions = new ArrayList<>();
		regions.add(new Region(1, "Europe"));
		regions.add(new Region(2, "Americas"));
		regions.add(new Region(3, "Asia"));
		regions.add(new Region(4, "Middle East and Africa"));

		HashMap<Integer, String> regionsMap = new HashMap<>();
		HashMap<Integer, ArrayList<Country>> countryMap = new HashMap<>();

		for (Region elem : regions) {
			regionsMap.putIfAbsent(elem.getId(), elem.getRegionName());
		}
		// System.out.println(regionsMap);

		//Task3 task = new Task3();
		//List<Country> countriesUsingTask = task.run();

		ArrayList<Country> countries = new ArrayList<>();
		countries.add(new Country("IT", "Italy", 1));
		countries.add(new Country("JP", "Japan", 3));
		countries.add(new Country("US", "United States of America", 2));
		countries.add(new Country("CA", "Canada", 2));
		countries.add(new Country("CN", "China", 3));
		countries.add(new Country("IN", "India", 3));
		countries.add(new Country("AU", "Australia", 3));
		countries.add(new Country("ZW", "Zimbabwe", 4));
		countries.add(new Country("SG", "Singapore", 3));
		countries.add(new Country("UK", "United Kingdom", 1));
		countries.add(new Country("FR", "France", 1));
		countries.add(new Country("DE", "Germany", 1));
		countries.add(new Country("ZM", "Zambia", 4));
		countries.add(new Country("EG", "Egypt", 4));
		countries.add(new Country("BR", "Brazil", 2));
		countries.add(new Country("CH", "Switzerland", 1));
		countries.add(new Country("NL", "Netherlands", 1));
		countries.add(new Country("MX", "Mexico", 2));
		countries.add(new Country("KW", "Kuwait", 4));
		countries.add(new Country("IL", "Israel", 4));
		countries.add(new Country("DK", "Denmark", 1));
		countries.add(new Country("HK", "HongKong", 3));
		countries.add(new Country("NG", "Nigeria", 4));
		countries.add(new Country("AR", "Argentina", 2));
		countries.add(new Country("BE", "Belgium", 1));

		//countries.sort(Comparator.comparing(Country :: getId));

		//Collections.sort(countries, Comparator.comparing(Country :: getId));

		//countries.stream().sorted(Comparator.comparing(Country ::getId)).forEach(elem -> System.out.println(elem));

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Region Code to see all the countries in it ");
//		int getRegion = sc.nextInt();

//		for(Country elem : countries)
//		{
//			if(elem.getId() == getRegion && regionsMap.containsKey(getRegion) == true)
//				System.out.println(elem);
//		}

		for (Country elem : countries) {
			countryMap.putIfAbsent(elem.getId(), new ArrayList<>());
			countryMap.get(elem.getId()).add(elem);
		}

//		countries.stream().
//		filter(elem -> elem.getId() == getRegion).
//		forEach(elem -> System.out.println(elem));

//		for(Country elem : countryMap.get(getRegion))
//			System.out.println(elem);

		// task 2
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Country CodeName : ");
		String getCountryCode = scan.nextLine();
		scan.close();
		//System.out.println(getCountryCode);

		for (Country elem : countries) {
			if (elem.getCodeName().equalsIgnoreCase(getCountryCode)) {
				System.out.println("The country name is " + elem.getFullName() + " The region it belongs to is "
						+ regionsMap.get(elem.getId()));
			}
		}
		
		
		countries.stream().filter(elem -> elem.getCodeName().equalsIgnoreCase(getCountryCode))
		.forEach(elem -> System.out.println("The country name is " + elem.getFullName() + " The region it belongs to is "
						+ regionsMap.get(elem.getId())));

	}

}
