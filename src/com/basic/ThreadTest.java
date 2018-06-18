package com.basic;

public class ThreadTest extends Thread{
	public void run(){
		System.out.println("running...");
	}
	public static void main(String args[]) {
		ThreadTest thread=new ThreadTest();
		thread.start();
		thread.start();
	}

}
