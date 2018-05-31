package com.basic;
class Date{
	int month;
	int day;
	int year;
	public Date(int month,int day,int year) {
		this.month=month;
		this.day=day;
		this.year=year;
		
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	void displayDate() {
		System.out.println("Date="+month+"/"+day+"/"+year);
	}
	
}

public class DateProgram {
	public static void main(String[] args) {
		Date d=new Date(5,31,2018);
		d.displayDate();
		
	}

}
