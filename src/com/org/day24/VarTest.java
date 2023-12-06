package com.org.day24;

import java.util.*;

public class VarTest {

	public static void main(String[] args) {
	
		//when you use var you have to initialize
		var str = "java";
		
		//var number; //This will give error.
		
		//var name = null;
		
		var number = 5;
		var name = "pon";
		
		var list = new ArrayList<>();
		list.add("Str");
		list.add(Double.valueOf(33.3));
		
		
		
		System.out.println(str);
 
	}
}
