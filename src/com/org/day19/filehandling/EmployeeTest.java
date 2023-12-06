package com.org.day19.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Arun",LocalDate.now());
		staff[1] = new Employee("Ginista",LocalDate.now());
		staff[2] = new Employee("Antanin",LocalDate.now());
		try(PrintWriter out = new PrintWriter("C:\\Users\\antan\\Desktop\\JavaFullStackDevelopment_Guvi\\FileHandling\\employee.dat","UTF-8")){
			writeData(staff, out);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Records are written into the file.");
		try(Scanner in = new Scanner(new FileInputStream("C:\\\\Users\\\\antan\\\\Desktop\\\\JavaFullStackDevelopment_Guvi\\\\FileHandling\\\\employee.dat")))
		{
			Employee[] newStaff = readData(in);
			for(Employee emp:newStaff) {
				System.out.println(emp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	
	}
	private static Employee[] readData(Scanner in) {
		int n = in.nextInt();
		in.nextLine();//move the cursor to the next line.
		Employee[] employees = new Employee[n];
		for(int i=0;i<n;i++) {
			employees[i] = readEmployee(in);
		}
		return employees;
	}
	private static Employee readEmployee(Scanner in) {
		String line = in.nextLine();
		String tokens[] = line.split("\\ ");
		String name = tokens[0];
		LocalDate dateOfJoining = LocalDate.parse(tokens[1]);
		return new Employee(name, dateOfJoining);
	}
	private static void writeData(Employee[] staff, PrintWriter out) {
		out.println(staff.length);
		for(Employee employee:staff) {
			writeEmployee(out,employee);
		}
	}
	private static void writeEmployee(PrintWriter out,Employee employee) {
		out.println(employee.getName()+" "+employee.getDateOfJoining());
	}
	

}
