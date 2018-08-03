package com.basic;
import java.util.*;


class StudentEx{
	String name;
	int id;
	StudentEx(String name,int id){
		this.name=name;
		this.id=id;
	}
}

public class HashtableExample {
    public static void main(String args[]) {
    	StudentEx stu1=new StudentEx("Anu",1);
    	StudentEx stu2=new StudentEx("Bhavan",2);
    	Hashtable<Integer,StudentEx> h=new Hashtable<Integer,StudentEx>();
    	h.put(3, stu1);
    	h.put(2, stu2);
    	for(Map.Entry m:h.entrySet()) {
    		int keyvalue=(int) m.getKey();
    		StudentEx s=(StudentEx) m.getValue();
    		System.out.println(s.name+"   "+s.id);
    	}
    	Set s=h.entrySet();
    	Iterator itr=s.iterator();
    	while(itr.hasNext()) {
    		Map.Entry e=(Map.Entry)itr.next();
    		int keyvalue1=(int)e.getKey();
    		StudentEx k=(StudentEx)e.getValue();
    		System.out.println(keyvalue1+"  "+k.name+"   "+k.id);
    	}
    }
}
