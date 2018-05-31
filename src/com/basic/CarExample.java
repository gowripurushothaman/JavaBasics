package com.basic;

public class CarExample {
	int Speed,i;
	public static void main(String[] args) {
		Car car=new Car();
		car.speed=100;
		CarExample carexample=new CarExample();
		carexample.amethod(car);
		System.out.println(car.getSpeed());
		
		
		
	}
	public void amethod(Car car) {
		car.setSpeed(300);
	}
	
		
	
}
	
	
