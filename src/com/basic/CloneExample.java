package com.basic;

public class CloneExample implements Cloneable{
	Car car;
	CloneExample(){
		
		car=new Car();
	}
public static void main(String[] args) {
	
	try {
	CloneExample ceone=new CloneExample();
	CloneExample cetwo=(CloneExample)ceone.clone();
	System.out.println(ceone.hashCode()+"  cloneable hashcode "+cetwo.hashCode());
	System.out.println(ceone.car.hashCode()+"  car hashcode "+cetwo.car.hashCode());
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
