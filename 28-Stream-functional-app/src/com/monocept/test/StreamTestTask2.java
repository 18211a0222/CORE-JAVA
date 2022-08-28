package com.monocept.test;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamTestTask2 {

	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("./lib/test.txt");
		int inputData = file.read();
		while(inputData != -1)
		{
			System.out.print((char)inputData);
			inputData = file.read();
		}
		file.close();
		
		System.out.println("\n");
		
		Stream<String> fileStream = Files.lines(Paths.get("./lib/test.txt"));
		fileStream.forEach(System.out::println);
		//Files.lines(Paths.get("./lib/test.txt")).forEach(System.out::println);
		
		
	}

}
