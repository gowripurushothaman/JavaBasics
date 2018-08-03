package com.basic;

import com.basic.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionExample {
	public static void main(String args[]) {
		//ArrayList Example
		List<String> arrayList=new ArrayList<>();
		arrayList.add("one");
		arrayList.add("two");
		arrayList.add("three");
		arrayList.add("one");
		System.out.println(arrayList.toString());
		System.out.println(arrayList.get(2));
		Student s1=new Student(1,80);
		Student s2=new Student(2,50);
		Student student[]= {s1,s2};
		List<Student> list=new ArrayList<Student>(Arrays.asList(student));
		System.out.println(list);
		Comparator<Student> comparator=new Comparator<Student>() {
			public int compare(Student o1,Student o2) {
			return Double.compare(o1.getMark(),o2.getMark());
			}
		};
		Collections.sort(list, comparator);
		System.out.println(list);
		//LinkedList Example
		List<String> linkedList=new LinkedList<>();
		arrayList.add("one");
		arrayList.add("two");
		arrayList.add("three");
		arrayList.add("one");
		System.out.println(arrayList.toString());
		System.out.println(arrayList.get(2));
		//vector
		Vector vec=new Vector();
		vec.add("one");
		vec.add(2);
		vec.add(22.2);
		Double d=(Double) vec.get(2);
		System.out.println(d);
		//vector by using generic method
		Vector<String> vec1=new Vector<String>();
		vec1.add("one");
		vec1.add("two");
		System.out.println(vec1.get(1));
		//Hash table
		Hashtable<String, Integer> hash=new Hashtable<>();
		hash.put("one", 1);
		hash.put("two",2);
		hash.put("three",3);
		System.out.println(hash.get("one"));
		
		
	}

}
