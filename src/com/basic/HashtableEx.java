package com.basic;
import java.util.*;




class Acc{
	String name;
	int AccountNum;
	Acc(String name,int AccountNum){
		this.name=name;
		this.AccountNum=AccountNum;
	}
	
}
public class HashtableEx {
	public static void main(String args[]) {
		Hashtable<Integer,Acc> h=new Hashtable<Integer,Acc>();
		Acc a1=new Acc("Kathir",123);
		Acc a2=new Acc("Murugan",124);
		Acc a3=new Acc("Anbu",125);
		h.put(1,a1);
		h.put(2, a2);
		h.put(3, a3);
		for(Map.Entry<Integer, Acc> e:h.entrySet()) {
			System.out.println(e.getKey());
			Acc a=e.getValue();
			System.out.println(a.name+"....."+a.AccountNum);
		}
	}

}
