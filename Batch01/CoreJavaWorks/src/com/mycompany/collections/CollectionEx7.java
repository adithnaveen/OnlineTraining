package com.mycompany.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// this program is to show working of HashMap 
public class CollectionEx7 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Harry", 3000);
		map.put("Peter", 5000);
		map.put("Scott", 5400);
//		
//		System.out.println("Scott Balance : " + map.get("Scott"));
//		System.out.println("Peter Balance : " + map.get("Peter"));
//		System.out.println("NoBody Balance : " + map.get("Nobody"));

		Set mySet = map.entrySet();
		Iterator itr = mySet.iterator();
		
		while(itr.hasNext()){
			Map.Entry<String, Integer> temp = (Entry<String, Integer>) itr.next();
			
			System.out.println("Key -> " + temp.getKey() +", " + "Value -> " + 
						temp.getValue());
		}
		
	}
}
