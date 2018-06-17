package com.basic;

import java.util.Arrays;
import java.util.Comparator;

public class Student {
	int id;
	int mark;
	Student(int id,int mark){
		this.id=id;
		this.mark=mark;
	}
	
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

public static void main(String args[]) {
	Student s1=new Student(1,80);
	Student s2=new Student(2,50);
	Student student[]= {s1,s2};
	for(int i=0;i<student.length;i++) {
		System.out.println(student[i].getMark());
	}
	Comparator<Student> comparator=new Comparator<Student>() {
		public int compare(Student o1,Student o2) {
		return Double.compare(o1.getMark(),o2.getMark());
		}
	};
	Arrays.sort(student, comparator);
	for(int i=0;i<student.length;i++) {
		System.out.println(student[i].getMark());
	}
	System.out.println(Arrays.toString(student));
}
}
