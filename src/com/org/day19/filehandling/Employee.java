package com.org.day19.filehandling;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Comparable<Employee>,Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private LocalDate dateOfJoining;
	
	public Employee(String name, LocalDate dateOfJoining) {
		super();
		this.name = name;
		this.dateOfJoining = dateOfJoining;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dateOfJoining=" + dateOfJoining + "]";
	}
	public int compareTo(Employee other) {
		
		return this.name.compareTo(other.name);
	}
	

}
