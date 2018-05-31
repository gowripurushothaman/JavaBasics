package com.basic;
class Celcius{
	float temp;
	public Celcius() {
		
	}
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public void celcius(float temp) {
		temp= (float)(5.0 / 9.0 * ( temp - 32 )); 
		System.out.println("Celcius="+temp);
	}
	public void fahrenheit(float temp) {
		 temp = (float)(9.0 / 5.0 * temp + 32);
		 System.out.println("Fahrenheit="+temp);
		 
	}
	
}

public class Temperature {
	public static void main(String[] args) {
		Celcius c=new Celcius();
		c.setTemp(60);
		c.celcius(c.getTemp());
		c.fahrenheit(c.getTemp());
		
	}

}
