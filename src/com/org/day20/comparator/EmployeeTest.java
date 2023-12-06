package com.org.day20.comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] Employees = new Employee[3];
		Employees[0] = new Employee("Arun",18,LocalDate.of(1997,10,18));
		Employees[1] = new Employee("Ginista",17,LocalDate.of(2001,9,24));
		Employees[2] = new Employee("Antanin",16,LocalDate.of(1974,2,6));

	List<Employee> list = Arrays.asList(Employees);
	Collections.sort(list,new EmployeeAgeComparator());
	
		for(Employee Employee:Employees) {
			
			System.out.println(Employee);
		}
		System.out.println();
		System.out.println("Sorting using date of joining: ");
		Collections.sort(list,new DateofJoiningComparator());
		
		for(Employee Employee:Employees) {
			
			System.out.println(Employee);
		}
		

	}

}
