package com.mycompany.day3;


// The class A is the child of class called Object 
// in java the super most class in the hierarchy is 
// Object Class 
class A{
	A(){
		super();
		System.out.println("Hey I'm Constructor in class A");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("Hey I'm Constructor in class B");
	}
}
class C extends B{
	C(){
		super();
		System.out.println("Hey I'm constructor in class C");
		
	}
}

public class InheExample {
	public static void main(String[] args) {
		C objc = new C();
	}
}
