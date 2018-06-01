package com.basic;

public class ConstructorCallUsingThis {
	int a,b,e;
	ConstructorCallUsingThis(int a,int b){
		this.a=a;
		this.b=b;
		
	}
	ConstructorCallUsingThis(int a, int b,int e){
		this(a,b);
		this.e=e;
		System.out.println(a+" "+b+" "+e);
		
	}
	public static void main(String[] args) {
		ConstructorCallUsingThis obj=new ConstructorCallUsingThis(10,20,30);
		
	}

}
