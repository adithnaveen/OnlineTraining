package com.sdettraining.day05;

class Devices implements Comparable<Devices>{
	private int dId; 
	private String dName; 
	private double dPrice;
	
	public Devices(int dId, String dName, double dPrice) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dPrice = dPrice;
	}
	
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public double getdPrice() {
		return dPrice;
	}
	public void setdPrice(double dPrice) {
		this.dPrice = dPrice;
	}

	@Override
	public int compareTo(Devices o) {
		// return this.dId - o.getdId();
		// Ascending Order 
//		return this.dName.compareTo(o.getdName());
		
		return o.getdName().compareTo(this.dName);
	}

	@Override
	public String toString() {
		return "Devices [dId=" + dId + ", dName=" + dName + ", dPrice=" + dPrice + "]";
	} 
	
	
	
}
