package com.basic;

public class Taxi extends Car{
	Taxi(){
		System.out.println("this is subclass constructor");
	}
	Taxi(int a){
		System.out.println("the subclass value");
	}
	@Override
	public void Accelarate() {
		// TODO Auto-generated method stub
		//super.Accelarate();
		System.out.println("this is override value");
	}
public static void main(String[] args) {
	Taxi taxi=new Taxi(10);
	taxi.Accelarate();
	
}
}
