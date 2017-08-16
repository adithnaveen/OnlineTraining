package com.mycompany.exceptions;

public class MyIncomeTaxException extends Exception{
	private String msg;
	
	public MyIncomeTaxException(){
		String msg ="Income Tax Exception Occured";
	}
	
	public MyIncomeTaxException(String msg){
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "MyIncomeTaxException [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {
		return "::::::::::::::" + msg;
	}
	
	
	
}
