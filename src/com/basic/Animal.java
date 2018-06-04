package com.basic;

public abstract class Animal implements Travel{


}
class Rabbit extends Animal{

	@Override
	public void getSpeed() {
		// TODO Auto-generated method stub
		System.out.println("2Km per hour");
	}
	
}
