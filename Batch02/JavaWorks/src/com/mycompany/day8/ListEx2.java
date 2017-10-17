package com.mycompany.day8;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("List size is " + list.size());
		list.add(100); 
		list.add(200);
		list.add(300);
		
		System.out.println("List size after adding " + list.size());
		list.remove(0);
		System.out.println("List Size after deleting " + list.size());
		
		list.add(400);
		
		System.out.println("List -> " + list);
		for(int i=0; i<list.size() ; i++){
			System.out.println(list.get(i));
		}
		///////////////////////////////////////
		System.out.println("--------- with iterators-----------");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			Integer temp = itr.next();
			System.out.println("Value is " + temp);
		}
		/////////////////////////////////////
		// in reality when we write this statement 
		// it will get converted to while loop 
		for(Integer temp : list){
			System.out.println("---- Value is " + temp);
		}
		
		
		list.clear();
		
		System.out.println(list);
	}
}





