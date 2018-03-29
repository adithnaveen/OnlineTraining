package com.sdettraining.entity;

public class Account {
	private int accNo; 
	private String customerName; 
	private double accBal; 
	private String customerEmail;
	
	public Account(){}
	
	public Account(int accNo, String customerName, double accBal, String customerEmail) {
		super();
		this.accNo = accNo;
		this.customerName = customerName;
		this.accBal = accBal;
		this.customerEmail = customerEmail;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", customerName=" + customerName + ", accBal=" + accBal + ", customerEmail="
				+ customerEmail + "]";
	} 
	
	
}
