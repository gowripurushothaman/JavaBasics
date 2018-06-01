package com.basic;

public class MethodCallUsingThis {
	public void method() {
		this.mm();
		System.out.println("hello");
	}
	public void mm() {
		System.out.println("hiii");
	}
	

public static void main(String[] args) {
	
	MethodCallUsingThis m=new MethodCallUsingThis();
	m.method();
	
}
}
