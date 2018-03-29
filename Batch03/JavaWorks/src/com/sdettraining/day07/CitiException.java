package com.sdettraining.day07;

public class CitiException extends Exception{
	String msg; 
	public CitiException() {
		this.msg = "Citi Bank Exception called with no message"; 
	}
	
	public CitiException(String msg){
		this.msg = msg; 
	}

	@Override
	public String getMessage() {
		return this.msg; 
	}

	@Override
	public String toString() {
		return "[ " + this.msg + " ]";
	}
}