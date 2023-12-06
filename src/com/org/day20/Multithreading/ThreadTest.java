package com.org.day20.Multithreading;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {
	public static void main(String[] args) {
		Runnable thread1 = new MyThread("one");//new state
		Runnable thread2 = new MyThread("Two");
		Runnable thread3 = new MyThread("Three");

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();//Runnable state
		t3.start();
		
		/*t1.interrupt();//it will interrupt the thread 
		System.out.println(t1.isInterrupted());
		t1.isDaemon();
		*/
		
		//Thread Priority
	/*	t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t2.setDaemon(true);
			*/
	}

}

//can also create threas by extending thread class
//class MyThread extends Thread
class MyThread implements Runnable{
	private String threadName;
	private Map<String, String> map;
	private Lock mapLock = new ReentrantLock();
	
	public MyThread(String name) {
		this.threadName = name;
		map = new HashMap<>();
	}
	@Override
	public void run() {
		
			try {
			/*	for(int i=1;i<=5;i++) {
					System.out.println("Running "+threadName+" counter = "+i);
				   synchronized(map){
					map.put("Thread Name", threadName);
				   }
					//Give other thread time to run it.
				
				*/
				//Lock -one way to achieve synchronisation.
					mapLock.lock();
				try {
					map.put("ThreadName", threadName);
					
				}finally {
					mapLock.unlock();
				}
				Thread.sleep(1000);//Blocked state
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			map.entrySet().stream().forEach(System.out::println);
	
	}
}