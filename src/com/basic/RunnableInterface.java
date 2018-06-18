package com.basic;

public class RunnableInterface implements Runnable{
	String name;
	public RunnableInterface(String name) {
		this.name=name;
		Thread thread=new Thread(this,name);
		thread.start();
		
	}
	@Override
	public void run() {
		System.out.println("running..."+name);
		
	}
public static void main(String args[]) {
	RunnableInterface run1=new RunnableInterface("one");
	RunnableInterface run2=new RunnableInterface("two");
	RunnableInterface run3=new RunnableInterface("three");
	//another way
	Thread thread=new Thread(run1);
	thread.start();
}
}
