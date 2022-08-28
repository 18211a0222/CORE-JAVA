package com.monocept.test;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String args[]) {

		String test = "name : raj;name : ram;name : uday;name : sanjay;name : vijay";
		
		StringTokenizer st = new StringTokenizer(test);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			System.out.println(st.countTokens());
			
		}
	}
}
