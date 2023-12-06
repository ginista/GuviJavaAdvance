package com.org.day20.comparator;

import java.time.LocalDate;
import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private String name;
	private Integer age;
	private LocalDate dateOfJoining;
	
	public Employee(String name, Integer age, LocalDate dateOfJoining) {
		super();
		this.name = name;
		this.age = age;
		this.dateOfJoining = dateOfJoining;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", dateOfJoining=" + dateOfJoining + "]";
	}

	@Override
	public int compareTo(Employee o) {
	 	return Integer.compare(this.age, o.age);
	}

}

class EmployeeAgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return Integer.compare(o1.getAge(), o2.getAge());
	}
	
}

class DateofJoiningComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return  o2.compareTo(o1);
	}
	
}
