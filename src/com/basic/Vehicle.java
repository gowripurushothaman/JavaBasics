package com.basic;

public abstract class Vehicle implements Travel{
	
	

}

class Bus extends Vehicle{

	@Override
	public void getSpeed() {
		// TODO Auto-generated method stub
		System.out.println("25km per hour");
		
	}
	
	
}
class Cycle extends Vehicle{

	@Override
	public void getSpeed() {
		// TODO Auto-generated method stub
		System.out.println("10km per hour");
		
	}
	
}
