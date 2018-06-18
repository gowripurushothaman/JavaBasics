package com.basic;

public class SleepMethod extends Thread{
	public SleepMethod(){
		start();
	}
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
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
		SleepMethod sleep=new SleepMethod();
		SleepMethod sleepone=new SleepMethod();
		//sleep.start();
		//sleepone.start();
		
	}

}
