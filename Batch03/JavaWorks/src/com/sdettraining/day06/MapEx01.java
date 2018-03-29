package com.sdettraining.day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>(); 
		
		map.put("computer", 3); 
		map.put("laptop", 4); 
		map.put("markers", 20);
		map.put("eraser", 34);
		
//		System.out.println("Number of Laptop's Ordered: "+map.get("laptop"));
//		map.put("laptop", 8); 
//		System.out.println("Number of Laptop's Ordered: "+map.get("laptop"));
		
		
		Set mySet = map.entrySet(); 
		
		Iterator itr = mySet.iterator(); 
		
		while(itr.hasNext()){
			Map.Entry temp = (Entry) itr.next(); 
			
			System.out.println(temp.getKey() +", " + temp.getValue());
			
		}
		
		
		
	}
}
