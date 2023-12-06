package com.org.day24;

import java.time.LocalDate;

public class Record {

	public static void main(String[] args) {
		//Removes boiler plate code. No setters
		Person person = new Person("Gini",22,LocalDate.now());
		System.out.println(person);
		System.out.println(person.name());

	}
	

}
record Person (String name, Integer age, LocalDate dateOfJoining) {}
