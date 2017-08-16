package com.mycompany.collections;

import java.util.ArrayList;
import java.util.Iterator;

// this program is to show working of collection with type safe 
// list stores the value in the order which is given 
public class CollectionEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Radha");
		list.add("Luis");
		list.add("Rashmi");
		list.add("Madhuri");
		list.add("Natraj");
		
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove("Natraj");
		System.out.println(list);
		
		list.clear();
		
		System.out.println(list);
		
		
		
		
		// this is only for look and feel 
		
//		for(String temp : list){
//			System.out.println(temp);
//		}
//		
//		// will be converted to below code by compiler when 
//		// the transalation happens 
//		System.out.println("----------------------------------");
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext()){
//			String temp = itr.next();
//			
//			System.out.println(temp);
//		}
		
	}
}
