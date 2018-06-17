package com.basic;

public class EmployeeRef {
	int id;
	String name;
	public EmployeeRef() {
		
	}
	public EmployeeRef(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
		System.out.println("sridhar Thangavel");
	}
	
	public static void main(String args[]) {
		EmployeeRef e=new EmployeeRef(101,"ravi");
		
	
	}

}
