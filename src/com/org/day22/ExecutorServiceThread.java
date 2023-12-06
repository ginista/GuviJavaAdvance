package com.org.day22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorServiceThread {
public static void main(String[] args) {
	Runnable runnableTask = () ->{
		try {
		for(int i=1;i<=5;i++) {
			System.out.println("Counter = "+i);
			Thread.sleep(1000);
		}
	}
	catch(InterruptedException ex) {
		ex.printStackTrace();
	}
};
//Three types of thred pool --> cached, fixed, scheduled

ExecutorService executorService = Executors.newFixedThreadPool(10);//add 10 worker threads to the executor service.
executorService.execute(runnableTask);
executorService.shutdown();
}
}

