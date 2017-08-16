package com.mycompany.collections;

import java.util.HashSet;

// this program is to show storing the values in hashset 
// of user def type 
public class CollectionEx5 {
	public static void main(String[] args) {
		HashSet<Customer> cust = new HashSet<Customer>();
		
		cust.add(new Customer(101, "Rashmi"));
		cust.add(new Customer(44, "Radha"));
		cust.add(new Customer(788, "Ramy"));
		cust.add(new Customer(788, "Ramy"));
		
		for(Customer temp : cust){
			System.out.println(temp +", stored @ " + temp.hashCode());
		}
	}
}
