package com.org.day24;

public class SwitchTest {

	public static void main(String[] args) {
		
		String today = "tuesday";
		
		boolean weekday = switch(today) {
		
		case "monday","tuesday","friday" ->true;
		case "saturday","sunday" ->false;
		default -> throw new IllegalArgumentException("Wrong date");
		};
		
		System.out.println(weekday);
		
		int sizeInNumber = 40;
		String size = switch(sizeInNumber) {
		case 39,40 -> "small";
		case 41,42 -> "medium";
		case 43,44 -> "Large";
		default -> throw new IllegalArgumentException("Wrong date");
		
		};
		System.out.println(size);
		
		//Text Blocks --> Multi level strings
		String sentence = """
				<html> like this in java servlets
				abc
				def
				""";
		
		System.out.println(sentence);
		
	}
}
