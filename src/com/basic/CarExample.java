package com.basic;

public class CarExample {
	public static void main(String[] args) {
		Car car=new Car();
		car.setSpeed(100);
		CarExample carexample=new CarExample();
		carexample.amethod(car);
		System.out.println(car.getSpeed());
		
		
		
	}
	public void amethod(Car car) {
		car.setSpeed(300);
	}
		
	
}
	
	
