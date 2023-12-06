package com.org.day24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class StringStreamTest {
	
	public static void main(String[] args) throws IOException {
		String word = " java \n is \n             a\n popular \nlanguage";
		//How to convert into stream of characters
		
		word.chars();
		
		List<String> lines = word.lines().map(String::strip).toList();
		
		Path path = Files.writeString(Files.createTempFile("Sample",".txt"), word,StandardOpenOption.APPEND);
		
		String fileContect = Files.readString(path);
		System.out.println();
		
		lines.forEach(System.out::println);
		
		
	}

}
