package com.monocept.test;

import java.util.*;
import java.io.*;

public class PropertiesFileTest {

	public static void main(String[] args) throws Exception{ 
		
	    FileReader propfile =new FileReader("./resources/Test.properties");  
	    char[] cbuf = null;
		System.out.println(propfile.read(cbuf, 0, 20));
//	      
//	    Properties prop =new Properties();  
////	    prop.load(propfile);  
//	    
//	    prop.load(new FileInputStream("./resources/Test.properties"));
//		//System.out.println(prop);
//		prop.list(System.out);
//	      
//		System.out.println(prop.getProperty("employeeName"));
//		System.out.println(prop.getProperty("id"));
//		System.out.println(prop.getProperty("salary"));
//		System.out.println(prop.getProperty("age"));
	    
		
//		Properties prop = new Properties();
//		try {
//			
//			prop.setProperty("employeeName", "raju");
//			prop.setProperty("id", "124");
//			prop.setProperty("salary", "30000");
//			prop.setProperty("age", "25");
//		
//			FileOutputStream somefile = new FileOutputStream("./resources/storeTest.properties");
//			prop.store(somefile, "new file is created");
//			prop.list(System.out);
//			
//			System.out.println();
//			
//			prop.replace("age", "22");
//			prop.list(System.out);
//			prop.store(new FileOutputStream("./resources/storeTest.properties"), null);
//			
//			
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		}
	}
}
