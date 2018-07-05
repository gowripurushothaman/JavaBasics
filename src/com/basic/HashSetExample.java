package com.basic;
import java.util.*;

class BookBook{
	int id;
	String name;
	String author;
	
	int quantity;
	BookBook(int id,String name,String author,int quantity) {
		this.id=id;
		this.author=author;
		this.name=name;
		this.quantity=quantity;
	}
}
public class HashSetExample {
	public static void main(String args[]) {
	
		BookBook b1=new BookBook(101,"Let us C","Yashwant",8);
		BookBook b2=new BookBook(102,"Data Communication","Frozon",4);
		BookBook b3=new BookBook(101,"Let us C","Yashwant",8);
		HashSet<BookBook> h=new HashSet<BookBook>();
		h.add(b1);
		h.add(b2);
		h.add(b3);
		for(BookBook b:h) {
			
			System.out.println("id="+b.id+" "+"name"+b.name+" "+"author"+b.author+" "+"quantity "+b.quantity);
		}
		
		
		
	}

}
