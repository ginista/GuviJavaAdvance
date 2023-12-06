package com.org.day20.Multithreading;


public class ThreadToPrintEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable thread1 = new Even("Even");
		Runnable thread2 = new Odd("Odd");
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		
		
		t2.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		
		
		

	}

}

class Even implements Runnable{

	private String threadName;
	
	
	public Even(String threadName) {
		this.threadName = threadName;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=2;i<=10;i+=2) {
				System.out.println(i);
				Thread.sleep(1000);  	
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
class Odd implements Runnable{

	private String threadName;
	
	
	public Odd(String threadName) {
		this.threadName = threadName;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			for(int j=1;j<=10;j=j+2) {
				System.out.println(j);
			Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
