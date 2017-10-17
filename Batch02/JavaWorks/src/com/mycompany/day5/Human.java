package com.mycompany.day5;

public class Human extends Animal implements IBehaviour{

	@Override
	void talk() {
		System.out.println("Human talk with Accent... / language ");
	}

	@Override
	void walk() {
		System.out.println("Human walks with 2 legs... ");
	}

	@Override
	public void dressCode() {
		System.out.println("mon-thu -> formals, fir -> casuals");
	}

	@Override
	public void workTimings() {
		System.out.println("work for 8 hrs a day");
	}

}
