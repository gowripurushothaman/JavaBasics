package com.basic;

public class Dog extends Cat{
	String voice;
	public void catVoice() {
		System.out.println("bow bow...");
	}
	
	@Override
	public void catFood() {
		// TODO Auto-generated method stub
		//super.catFood();
		System.out.println("White Milk");
	}
	public void dogName() {
		System.out.println("peter");
	}

	public static void main(String[] args) {
		Cat cat=new Dog();
		cat.catVoice();
		cat.catFood();
		Dog d=new Dog();
		d.dogName();
		d.catVoice();
		d.catFood();
		d.dogName();
	
	}

}
