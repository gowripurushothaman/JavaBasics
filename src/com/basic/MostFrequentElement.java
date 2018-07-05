package com.basic;
import java.util.*;
import java.util.Map.Entry;

public class MostFrequentElement {
	public static void getMostFrequentElement(int[] inputArray) {
		HashMap CountElement=new HashMap();
		for(int i:inputArray) {
			if(CountElement.containsKey(i)) {
				int count=(int) CountElement.get(i);
				CountElement.put(i, count+1);
			
			}else
				CountElement.put(i,1);
		}
		System.out.println(CountElement);
		Set entryset=CountElement.entrySet();
		int element=0;
		int frequency=0;
		Iterator itr=entryset.iterator();
		while(itr.hasNext()) {
			Map.Entry e=(Map.Entry)itr.next();
			if((int)e.getValue()>frequency) {
				element=(int)e.getKey();
				frequency=(int)e.getValue();
			}
		}
		if(frequency>1) {
			System.out.println(element);
			System.out.println(frequency);
		}
		
	}
	public static void main(String args[]) {
	getMostFrequentElement(new int[]{4, 5, 8, 7, 4, 7, 6,7});
	}
	

}
