package com.mycompany.day3;

public class Display {
	private int len; 
	private int bre;
	private String type;  // color, mono 
	
	public final int getLen() {
		return len;
	}
	public final void setLen(int len) {
		this.len = len;
	}
	public final int getBre() {
		return bre;
	}
	public final void setBre(int bre) {
		this.bre = bre;
	}
	public final String getType() {
		return type;
	}
	public final void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return this.len +", " + this.bre +", " + this.type;
	}
	
	
}
