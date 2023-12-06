package com.org.day20.comparator;

import java.util.Comparator;

public class Student  {
	
	private String name;
	private int age;
	private String department;
	private int rollNumber;
	
	public Student(String name, int age, String department, int rollNumber) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.rollNumber = rollNumber;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", department=" + department + ", rollNumber=" + rollNumber
				+ "]";
	}
	
	
}



class RollNumberComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // Compare based on age
        return Integer.compare(o1.getRollNumber(), o2.getRollNumber());
    }
}