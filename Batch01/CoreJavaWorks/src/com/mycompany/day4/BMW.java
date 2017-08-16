package com.mycompany.day4;

public class BMW extends Car {

	private JBLMusicPlayer musicPlayer;
	
	public BMW(int noOfWheels, int noOfSeats,
			int noOfDoors, JBLMusicPlayer musicPlayer) {
		super(noOfWheels, noOfSeats, noOfDoors);
		this.musicPlayer = musicPlayer;
	}

	public void hasAbs(){
		System.out.println("BMW Comes with ABS...");
	}

	public final JBLMusicPlayer getMusicPlayer() {
		return musicPlayer;
	}
	
	
}
