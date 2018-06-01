package com.basic;
class Example1{
	Boolean func(int data) {
		return data<10? true:false;
	}
	
}
public class Example{
	public static void main (String[] args) {
		Example1 ex=new Example1();
		Boolean b=ex.func(8);
		System.out.println(b);
		
		System.out.println(ex.func(8));
		
	}
}