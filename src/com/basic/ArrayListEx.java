package com.basic;

import java.util.ArrayList;
import java.util.Iterator;

class Book{
	
		int id;
		String name,author,publisher;  
		int quantity;  
		public Book(int id, String name, String author, String publisher, int quantity) {  
		    this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity;  
	}
}
public class ArrayListEx {
	public static void main(String args[]) {
		ArrayList<Book> al=new ArrayList<Book>();
		 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		 Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		 Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
		al.add(b1);
		al.add(b2);
		al.add(b3);
		System.out.println("Array list befor addAll():");
		System.out.println(" ");
		for(Book b:al) {
			System.out.println(b.author+" "+b.author+" "+b.publisher+" "+b.id);
		}
		System.out.println("");
		ArrayList<Book> al2=new ArrayList<Book>();
		Book b4=new Book(104,"Operating System","Galvin","Wiley",6);
		Book b5=new Book(103,"Operating System","Galvin","Wiley",6);
		al2.add(b4);
		al2.add(b5);
	    al.addAll(al2);
	    System.out.println("Array list after addAll():");
	    System.out.println(" ");
		for(Book b:al) {
			System.out.println(b.author+" "+b.author+" "+b.publisher+" "+b.id);
		}
//		 Iterator itr=al.iterator();  
//		  while(itr.hasNext()){  
//		   System.out.println(itr.next());  
//		  }  
		al.removeAll(al2);
		System.out.println(" ");
		System.out.println("Array list after removeAll():");
	    System.out.println(" ");
		for(Book b:al) {
			System.out.println(b.author+" "+b.author+" "+b.publisher+" "+b.id);
		}
		
	}

}
