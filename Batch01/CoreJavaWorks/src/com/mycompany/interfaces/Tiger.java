package com.mycompany.interfaces;

public class Tiger implements IAnimal {

	@Override
	public void talk() {
		System.out.println("Tiger -> wwrrr.... wrrrr....wwrrr..");
		
	}

	@Override
	public void walk() {
		System.out.println("Tiger walk with two legs & two limbs... ");
	}

	@Override
	public void shout() {
		System.out.println("Tiger -> WERRR... WRRR.... WRRRR..");
	}
	
}
