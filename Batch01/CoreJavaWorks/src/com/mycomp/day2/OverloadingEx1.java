package com.mycomp.day2;

// in a class you can have same method name and different signature is called 
// overloading 
// compile time polymorphism 
class Shape{
	void display(){
		System.out.println("display called with no-args");
	}
	
	void display(int num){
		System.out.println("Display called with 1 arg - int " + num);
	}
	
	void display(float num){
		System.out.println("Display called with 1 arg - float " + num);
	}
	
	void display(String val){
		System.out.println("Dispaly called with 1 arg - string " + val);
	}
}


public class OverloadingEx1 {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.display(100);
		s.display("hello");
		s.display(123.5f);
		
	}
}
