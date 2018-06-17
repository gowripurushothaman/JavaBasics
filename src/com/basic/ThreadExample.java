package com.basic;

public class ThreadExample extends Thread {
	String name;
	public ThreadExample(String name){
		this.name=name;
		start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i=0;i<10;i++) {
			System.out.println(name+"="+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]) {
		ThreadExample threadone=new ThreadExample("one");
		ThreadExample threadtwo=new ThreadExample("two");
		System.out.println("Main Done"+Thread.currentThread());
	}

}
