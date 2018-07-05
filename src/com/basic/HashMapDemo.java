package com.basic;
import java.util.*;

public class HashMapDemo {
	public static void main(String args[]){
		HashMap h=new HashMap();
		h.put(1,"Gowri");
		h.put(2,"Sridhar");
		h.put(3,"Kalpana");
		h.put(4,"Purushothaman");
		h.put(5,"Sri");
		System.out.println("key");
		System.out.println(h.containsKey(1));
		System.out.println(h.get(1));
		System.out.println(h);
		Set s=h.keySet();
		System.out.println(s);
		//System.out.println(h.KeySet);
		Collection c=h.values();
		System.out.println(c);h.put(1,"Gow");
		System.out.println(h);
		Set ss=h.entrySet();
		System.out.println(ss);
	   Iterator itr=ss.iterator();
		
		while(itr.hasNext()){
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+"...."+m.getValue());
		}
		
	}
}
