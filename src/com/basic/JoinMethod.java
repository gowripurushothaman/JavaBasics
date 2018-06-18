package com.basic;

public class JoinMethod extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
public static void main(String args[]) {
	JoinMethod join=new JoinMethod();
	JoinMethod joinone=new JoinMethod();
	JoinMethod jointwo=new JoinMethod();
	
	join.start();
	joinone.start();
	jointwo.start();
	
	
}
}
