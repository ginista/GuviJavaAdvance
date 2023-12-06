package com.org.day22;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//This will run parallely in new threads.

public class CompletableFutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method 
        Executor executor = Executors.newFixedThreadPool(10);
        
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
        		try {
        			TimeUnit.SECONDS.sleep(1);
        		}
        		catch(InterruptedException ex) {
        			throw new IllegalStateException(ex);
        		}
        		return "Completed Asynchronous Execution";
        },executor);
        
        System.out.println(future.get());
        
        CompletableFuture<String> nameFuture = CompletableFuture.supplyAsync(()->{
    		try {
    			TimeUnit.SECONDS.sleep(1);
    		}
    		catch(InterruptedException ex) {
    			throw new IllegalStateException(ex);
    		}
    		return " gini";
    });
        
        CompletableFuture<String> greeting = nameFuture.thenApply(name ->{
        		return "Hello "+name;
        });
        
        System.out.println(greeting.get());

	}

}
