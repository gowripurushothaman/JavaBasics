package com.basic;

public class MethodsInThread extends Thread {
	public void run() {
		System.out.println("running..."+Thread.currentThread());}
public static void main(String args[]) {
    MethodsInThread one=new MethodsInThread();
   MethodsInThread two=new MethodsInThread();
   MethodsInThread three=new MethodsInThread();
   System.out.println(one.getName());
   System.out.println(two.getName());
   System.out.println(three.getName());
   System.out.println(one.getId());
  
   one.start();
  
  
   two.start();
   three.start();
   one.setName("firstthread");
   System.out.println("after setname="+one.getName());
  
}
}




