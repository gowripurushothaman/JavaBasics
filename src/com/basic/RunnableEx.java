package com.basic;

public class RunnableEx implements Runnable{
	String name;
	public RunnableEx(String name) {
		this.name=name;
		Thread thread=new Thread(this,name);
		thread.start();
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name+"="+i+Thread.currentThread());
		}
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		RunnableEx threadone=new RunnableEx("one");
		RunnableEx threadtwo=new RunnableEx("two");
		System.out.println("Man is done"+Thread.currentThread());
		
	}

	

}
