package com.basic;
class Employee{
	String firstName;
	String secondName;
	double monthlySalary;
	double salary;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	void increment(double i) {
		i=monthlySalary*0.1;
		salary=i;
		
	}
	Boolean checkSalary(double s) {
		if(s<0)
			return false;
		else
			return true;
	}
	void display() {
		System.out.println("Yearly Salary of employee1="+monthlySalary);
		System.out.println("Yearly Salary after increment of employee1="+salary*12);
	}
	
	void display1() {
		System.out.println("Yearly Salary of employee2="+monthlySalary);
		System.out.println("Yearly salary after increment of employee2 is"+salary*12);
	}
	
	
	
}

public class Salary {
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setFirstName("Gopal");
		e1.setSecondName("Krishnan");
		e2.setFirstName("Ramya");
		e2.setSecondName("Sanjay");
		e1.setMonthlySalary(10000);
		e2.setMonthlySalary(15000);
		e1.checkSalary(e1.getMonthlySalary());
		e2.checkSalary(e2.getMonthlySalary());
		e1.increment(0.1);
		e2.increment(0.1);
		e1.display();
		e2.display1();
		}

}
