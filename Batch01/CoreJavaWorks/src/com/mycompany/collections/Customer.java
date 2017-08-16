package com.mycompany.collections;

public class Customer {
	private int custId;
	private String custName;
	
	
	public Customer(){}
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}
	
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
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
	// when ever an object is stored (before storing), the jvm has to be 
	// informed where the data should be stored, if not jvm by default will
	// refer to super.hashCode(), if super.hashCode() is referred then 
	// the new bucket is created
	@Override
	public int hashCode() {
		return this.custName.charAt(0);
	}
	@Override
	public boolean equals(Object obj) {
		Customer temp = (Customer) obj;
		
		if(temp.custId == this.custId && temp.custName.equals(this.custName)){
			return true;
		}else{
			return false;
		}
		
	}
	
	
}
