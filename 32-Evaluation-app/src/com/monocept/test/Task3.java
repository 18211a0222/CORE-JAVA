package com.monocept.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import com.monocept.model.Country;

public class Task3 {

	String value;
	String values[] = new String[3];
	int counter = 0;

	public List<Country> run() throws Exception {
		
		String fileName = "./lib/Countries.txt";
		List<Country> countries = new ArrayList<>();

		try (Scanner scan = new Scanner(new File(fileName))) {
			while (scan.hasNext()) {
				StringTokenizer st = new StringTokenizer(scan.nextLine());
				while (st.hasMoreTokens()) {
					value = st.nextToken(",");
					values[counter] = value;
					counter = counter + 1;
				}
				counter = 0;
				try {
					countries.add(new Country(values[0], values[1], Integer.parseInt(values[2])));
				} catch (NumberFormatException ex) {
					ex.printStackTrace();
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return countries;
	}
}
