package com.basic;

public class Priority extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName());//getName of thread
		System.out.println(Thread.currentThread().getPriority());//getPriority of thread
	}
	public static void main(String args[]) {
		Priority one=new Priority();
		Priority two=new Priority();
		Priority three=new Priority();
		one.setPriority(MAX_PRIORITY);
		two.setPriority(MIN_PRIORITY);
		one.start();
		two.start();
		
		
		
	}

}
