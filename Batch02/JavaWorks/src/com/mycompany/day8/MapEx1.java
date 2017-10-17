package com.mycompany.day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// HashSet<String> 
public class MapEx1 {
	public static void main(String[] args) {
		// Key in map will act like Set 
		// which means they keep only unique 
		// In set if you have the duplicate values 
		// set did not allow you to store, but in 
		// map it will overwrite 
		HashMap<String, Integer> map = new HashMap<String, Integer>();
			
		map.put("marker", 100);
		map.put("pen", 120);
		map.put("laptop", 232323);
		
		System.out.println("Market Price : "+map.get("marker"));
		System.out.println("Pen Price : "+map.get("pen"));
		
		map.put("marker", 200);
		System.out.println("Market Price : "+map.get("marker"));
		
		System.out.println("----------------------------------");
		
		// 1. have a set which maps the map 
		Set set = map.entrySet();
		
		// 2. Have an iterator which will iterate the set 
		Iterator itr = set.iterator();
		
		// 3. loop the iterator 
		while(itr.hasNext()){
			Map.Entry temp = (Entry) itr.next();
			
			System.out.println("Key : " + temp.getKey() +", Value : " + temp.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
