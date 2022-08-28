package com.monocept.test;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
 
        set.add("mom");
        set.add("dad");
        set.add("sis");
        
        System.out.println(set);
        System.out.println("Set contains mom ? " + set.contains("mom"));
        
        set.add("mom");
        
        set.remove("dad");
        System.out.println("set after removing dad:" + set);
	}

}
