package com.basic;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;

class Printjob implements Runnable {
	String name;

	public Printjob(String name) {
		this.name = name;
		System.out.println(name);
//		Thread thread=new Thread(this);
//		thread.start();
	}

	public void run() {
		System.out.println(name+"   starting..."+Thread.currentThread().getName());
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(name+"   stop working"+Thread.currentThread().getName());
	}
}

public class ExcutorDemo {
	public static void main(String args[]) {
		Printjob job[] = { new Printjob("durga"),new Printjob("ravi"),new Printjob("kalpana"),new Printjob("sridhar") };
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(Printjob jobs:job) {
			service.submit(jobs);
		}
		service.shutdown();
	}
}
