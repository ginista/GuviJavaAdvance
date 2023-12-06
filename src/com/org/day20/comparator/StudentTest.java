package com.org.day20.comparator;


import java.util.*;


public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		students[0] = new Student("Arun",18,"CSE",101918);
		students[1] = new Student("Ginista",17,"MECH",101922);
		students[2] = new Student("Antanin",16,"CSE",101952);
List<Student> studentList = Arrays.asList(students);
		//Using java 8, lambda expression, we can write like this also
		Comparator <Student> ageComparator = (Student e1, Student e2)->Integer.compare(e1.getAge(), e2.getAge());
		 Collections.sort(studentList, ageComparator);
		for(Student stud:studentList) {
			
			System.out.println(stud);
		}
		
		System.out.println();
		
		System.out.println("Sorting by roll number: ");
		 Arrays.sort(students, new RollNumberComparator());
			for(Student stud:students) {
				
				System.out.println(stud);
			}
			

	}

}
