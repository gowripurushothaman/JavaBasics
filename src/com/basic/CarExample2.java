package com.basic;

public class CarExample2 {
	int Speed,i;
	public static void main(String[] args) {
		CarExample2 carexample=new CarExample2();
		double count=10;
		carexample.amethod(count);
		System.out.println(count);
	}
	public void amethod(double i) {
		i=i+20;
	}
		

}
