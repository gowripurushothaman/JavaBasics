package com.basic;
class Multiply{
	int firstValue;
	int secondValue;
	public Multiply(int firstValue,int secondValue) {
		this.firstValue=firstValue;
		this.secondValue=secondValue;
		
	}
	public int getFirstValue() {
		return firstValue;
	}
	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}
	public int getSecondValue() {
		return secondValue;
	}
	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}
	public Boolean multiple(int firstValue,int secondValue) {
		 return (secondValue%firstValue)==0? true:false;
		
		
		 
	}
	public void even(int firstValue) {
		if(firstValue%2==0)
			System.out.println("The given number is Even");
		else
			System.out.println("The given number is not Even");
	}
	
}

public class Arithmatic {
	public static void main(String[] args) {
		Multiply m=new Multiply(3,9);
		System.out.println(m.multiple(3, 9));
		m.setFirstValue(12);
		m.even(m.getFirstValue());
		 
		
		
		
	}

}
