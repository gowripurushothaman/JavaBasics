package com.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class RefExample {

public static void main(String[] args) {
		try {
			Class cls=Class.forName("com.basic.EmployeeRef");
			Constructor cons[]=cls.getDeclaredConstructors();
			for(int i=0;i<cons.length;i++) {
				System.out.println(cons[i]);
			}
			EmployeeRef e=(EmployeeRef) cons[1].newInstance(99,"gow");
			System.out.println(e);
			Field field[]=cls.getDeclaredFields();
			for(int i=0;i<field.length;i++) {
				System.out.println(field[i]);
			}
			Method meth[]=cls.getDeclaredMethods();
			for(int i=0;i<meth.length;i++) {
				System.out.println(meth[i]);
				if(meth[i].getName().indexOf("setName")!=-1) {
					meth[i].invoke(e);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			 
		}

}}
