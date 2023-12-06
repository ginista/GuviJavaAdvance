package com.org.day24;

import java.util.*;

public class ImmutableCollectionTest {
	
	public static void main(String[] args) {
		
		Set<String> languages = new HashSet<>(); 
		
		languages.add("Java");
		languages.add("C");
		languages.add("C++");
		
		//Multiple copies also allowed.
		Set<String> immutableSetOne = Collections.unmodifiableSet(languages);
		
		Set<String> immutableSetTwo = Collections.unmodifiableSet(languages);
		
		//UnsupportedOperationException
		//immutableSetOne.add("Golang");
		
		System.out.println(languages);
		
		List<String> names = new ArrayList<>();
		List<String> copyOfNames = List.copyOf(names);
		
		copyOfNames.add("hello");
	}
	

}
