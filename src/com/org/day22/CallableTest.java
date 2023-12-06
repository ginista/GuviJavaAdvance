package com.org.day22;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		FactorialTask task = new FactorialTask(5);
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
       
		Future<Integer> future = executorService.submit(task);
				
		
		int value = future.get().intValue();
		System.out.println(value);
		
	 Callable<String> callableTask = () -> {
		 TimeUnit.MICROSECONDS.sleep(100);
		 return "Completed callable ";
	 };
	 
	 
	 List<Callable<String>> callableTasks = new ArrayList<>();//Creating callable object
	 callableTasks.add(callableTask);
	 callableTasks.add(callableTask);
	 callableTasks.add(callableTask);
	 
     List<Future<String>> futureList = executorService.invokeAll(callableTasks);//submitting to callable that returns future object
	
     for(Future<String> future1:futureList) {
    	 System.out.println(future1.get());
     }
     
     executorService.shutdown();
	}

}

class FactorialTask implements Callable<Integer>{
	
	private int number;
	public FactorialTask(int n) {
		this.number = n;
	}
	@Override
	public Integer call() throws Exception {
		int fact = 1;
		for(int i=1;i<=number;i++) {
			fact*=i;
		}
		return fact;
	}
	
}
