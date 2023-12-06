package com.org.day22;

import java.util.*;
import java.util.stream.Collectors;


public class HashMapInterchange {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('A', 65);
		map.put('B', 66);
		map.put('C', 67);
		map.put('D', 68);
		
		Map <Integer, Character> hashmap =map.entrySet().stream()
        .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
     //   .forEach((key, value) -> System.out.println(key + " : " + value));
		
		System.out.println(hashmap);
		
		

	}

}
