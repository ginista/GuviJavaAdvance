package com.org.day19.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadAndWriteFile {

	private void createFile() {
		String fileName = "C:\\Users\\antan\\Desktop\\JavaFullStackDevelopment_Guvi\\FileHandling\\Sample.txt";
	//	try(FileOutputStream outputStream = new FileOutputStream(fileName))  //This will write in bytes continously no space in between
		
		try(PrintWriter output = new PrintWriter(fileName))
		{
			Scanner scan = new Scanner(System.in);
			String line;
			do {
				System.out.println("Enter some words");
			   line = scan.nextLine();
			   
			   if(line.equals("exit")) {
				   break;
			   }
			 //  outputStream.write(line.getBytes());//bytes mean no space in file it will write continously.
			   
			   output.println(line);
			  
			}while(!line.equals("exit"));
			
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(fileName+" created successfully");
		
	}
	public static void main(String[] args) {
		ReadAndWriteFile file = new ReadAndWriteFile();
		file.createFile();
	}
}
