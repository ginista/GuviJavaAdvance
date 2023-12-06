package com.org.day22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferencePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		List<Double> list = Arrays.asList(10.5,20.4,30.6,40.8,50.7);
		
	 list.stream().mapToInt(Double::intValue).forEach(System.out::println);
	/* list.stream()
     .mapToDouble(Double::doubleValue)
     .map(Math::abs)
     .mapToInt((Double::intValue))
     .forEach(System.out::println);*/
	

	}

}
