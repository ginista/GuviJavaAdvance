package com.org.day22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Three method references are there static, non static, constructor
public class MethodReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("raja","arun");
		
		names.replaceAll(String::toUpperCase);
		names.forEach(System.out::println);
		
		List<Integer> intList = Arrays.asList(3,2,1,4);
		int sum = intList.stream().reduce(0,(i,j)->i+j);
		System.out.println(sum);
		
		int sum1 = intList.stream().reduce(0,Integer::sum);
		System.out.println(sum1);
		
		List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());// static
		
		upperCaseNames.forEach(System.out::println);

		names.forEach(name ->  System.out.println(StringUtil.toLower(name)));
	
	   names.forEach(StringUtil::toLower);//non- static
	   
	   names.stream().filter(name -> name.length()>3);
	   
	   Stream<String> strings = Stream.generate(String::new).limit(10);//constructor
	
	  Map<String, Integer> nameMap = new HashMap<>();
	  nameMap.put("rajasekaran", 11);
	  String key = "rajasekaran";
	  if(nameMap.get("rajasekaran")== null) {
		  nameMap.put(key, key.length());
	  }
	  Integer nameLength = nameMap.computeIfAbsent("rajasekaran", s -> s.length());
	  
	  nameMap.replaceAll((name, oldValue) -> name.equals(key)?oldValue+4:oldValue);
	  
	  System.out.println(nameLength);
	  System.out.println(nameMap.get(key));
	  
	  nameMap.put("Ginista", 7);
	  nameMap.forEach((name,length)->System.out.println(name+" is of length "+length));
	}
}
	class StringUtil{
		public static String toLower(String str) {
			return str.toLowerCase();
		}
	}



