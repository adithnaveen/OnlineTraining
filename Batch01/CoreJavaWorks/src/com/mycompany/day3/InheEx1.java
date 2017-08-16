package com.mycompany.day3;


// ther
// this program to have understanding of inheritance 

class A{
	A(){
		super(); // this will be invoked from Object 
		System.out.println("hey Object A Created... ");
	}
}

// to stop inheritance we can have an access modifier called final 
 class B extends A{
	B(){
		super();
		System.out.println("hey Object B Created...");
	}
}
class C extends B{
	C(){
		super();
		System.out.println("hey object C Created.... ");
	}
}



public class InheEx1 {
	public static void main(String[] args) {
		C objC = new C();
		System.out.println("---------------");
		B objB = new B();
		System.out.println("Object created.... ");
	}
}
