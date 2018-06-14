package com.basic;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ExceptionExample {
	public static void main(String args[]) {
		ExceptionExample ee=new ExceptionExample();
	int count=10;
	try {
	int c=count/0;
	}catch(Exception e) {
		
	}
	try {
		URL u=new URL("htt://www.google.com");
		URLConnection connection=u.openConnection();
		System.out.println("hiii");
		return;
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		System.out.println("hello");
		e.printStackTrace();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("helloooo");
		e.printStackTrace();
	}
	finally {
		System.out.println("finally");
	}
	try {
		ee.getValue();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("hello");
		e.printStackTrace();
	}
	
	try {
		ee.getValueOne();
	} catch (CustomerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public void getValue() throws IOException {
		URL u=new URL("htp://www.google.com");
		int count=10;
		if(count<100) {
			throw new MalformedURLException();
		}
		
	}
	public void getValueOne() throws CustomerException {
		//URL u=new URL("http://www.google.com");
		int count=10;
		if(count<100) {
			throw new CustomerException("msg");
		}
		
	}
	

}
