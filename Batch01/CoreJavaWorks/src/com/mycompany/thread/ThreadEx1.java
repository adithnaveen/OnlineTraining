package com.mycompany.thread;

// this class is not a threaded application 
// if you have a main method then the class is a threaded application 
// because for JVM the first child is always main 
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("Thread Name " + Thread.currentThread().getName());
		// every thread will have priority 
		// by default the priority is 5 (norm priority)
		// min priority - 1 
		// max priorty = 10 
		
		System.out.println("Priority for The Thread : " + Thread.currentThread().getPriority());
		
	}
}
