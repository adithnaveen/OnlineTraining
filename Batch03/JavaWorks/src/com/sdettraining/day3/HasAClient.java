package com.sdettraining.day3;

public class HasAClient {
	public static void main(String[] args) {
		Customer customer = new Customer(); 
		customer.setCustId(101);
		
			Name name = new Name(); 
			name.setfName("Aswini");
			name.setlName("Sridhar");
			
		customer.setName(name);
		customer.setIncome(5600);
		
		System.out.println("customer id " + 
				customer.getCustId());
		System.out.println("Customer First Name "+ 
				customer.getName().getfName());
		System.out.println("Customer Last Name "+ 
				customer.getName().getlName());
		
		System.out.println("Csutomer Income " + 
				customer.getIncome());
		
	}
}
