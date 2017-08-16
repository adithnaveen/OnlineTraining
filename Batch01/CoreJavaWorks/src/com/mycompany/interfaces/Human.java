package com.mycompany.interfaces;

class SomeClass{}

public class Human extends SomeClass implements IAnimal{

	@Override
	public void talk() {
		System.out.println("humans talk with diff accent... ");
	}

	@Override
	public void walk() {
		System.out.println("Humans walk with two legs");
	}

	@Override
	public void shout() {
		System.out.println("humans shout, zzzz..zzz... ");
	}

}
