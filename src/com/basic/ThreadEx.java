package com.basic;

public class ThreadEx extends Thread{
    @Override
    public void run() {
    	
    	// TODO Auto-generated method stub
    	System.out.println("running....");
    }
	public static void main(String args[]) {
		ThreadEx thread=new ThreadEx();
		ThreadEx thread1=new ThreadEx();
		thread1.start();
		thread.start();
	}

}
