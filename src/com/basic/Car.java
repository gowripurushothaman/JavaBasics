package com.basic;

public class Car {
		double speed;
		String model;
		public Car() {
			System.out.println("this is empty constructor");
			
		}
		
		public double getSpeed() {
			return speed;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Boolean Start() {
			return true;
			
		}
		public void Accelarate() {
			speed+=10;
			System.out.println("this is Accelarate value");
		}
		public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car();
		car1.speed=20.1;
		car2.speed=30.0;
		System.out.println(car1.speed);
		System.out.println(car2.speed);
		
	    }
}
