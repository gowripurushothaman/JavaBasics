package com.basic;
import java.util.concurrent.*;

public class ThreadPoolExample implements Runnable{
	String name;
	public ThreadPoolExample(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//get thread name
		System.out.println(Thread.currentThread().getName());

	}
public static void main(String args[]) {
	ThreadPoolExample thread[]= {new ThreadPoolExample("one"),new ThreadPoolExample("two"),new ThreadPoolExample("three"),new ThreadPoolExample("four"),new ThreadPoolExample("five")};
	ExecutorService service=Executors.newFixedThreadPool(3);
	for(ThreadPoolExample job:thread) {
		service.submit(job);
	}


	
}
	}
