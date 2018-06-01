package com.basic;
class Rectangle{
	float length=1f;
	float width=1f;
	Rectangle(){
		
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public void calculate(float length,float width) {
		float perimeter,area;
		perimeter=(float)(2*(length+width));
		area=(float)(length*width);
		System.out.println("The perimeter of rectangle is="+perimeter);
		System.out.println("The area of rectangle is="+area);
		
		
		
	}
	
	
}

public class RecPerimeterAndArea {
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.setLength(0.10f);
		r.setWidth(10.0f);
		r.calculate(r.getLength(),r.getWidth());
		
		

		
		
	}

}
