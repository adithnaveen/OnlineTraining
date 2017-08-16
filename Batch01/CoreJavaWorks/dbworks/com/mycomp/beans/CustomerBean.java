package com.mycomp.beans;

// to bean class 
// private variables 
// public getters and setters 
// default constructor (when you dont have the constructor then 
// the compiler will create a default constructor) 


public class CustomerBean {
	private int custId; 
	private String custName;
	private double custSal;
	private String custEmail;
	
	// optional you can have parametric constructor 
	
	public final int getCustId() {
		return custId;
	}
	public final void setCustId(int custId) {
		this.custId = custId;
	}
	public final String getCustName() {
		return custName;
	}
	public final void setCustName(String custName) {
		this.custName = custName;
	}
	public final double getCustSal() {
		return custSal;
	}
	public final void setCustSal(double custSal) {
		this.custSal = custSal;
	}
	public final String getCustEmail() {
		return custEmail;
	}
	public final void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	} 
	
	
}
