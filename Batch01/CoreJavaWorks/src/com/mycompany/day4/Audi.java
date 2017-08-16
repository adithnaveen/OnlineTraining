package com.mycompany.day4;

public class Audi extends Car{

	private JBLMusicPlayer musicPlayer;
	public Audi(int noOfWheels, int noOfSeats, int noOfDoors, JBLMusicPlayer musicPlayer) {
		super(noOfWheels, noOfSeats, noOfDoors);
		this.musicPlayer = musicPlayer;
		// TODO Auto-generated constructor stub
	}

	public void autoPilot(){
		System.out.println("Audi Cars come with Auto Pilot feature.... ");
	}

	public final JBLMusicPlayer getMusicPlayer() {
		return musicPlayer;
	}
	
	
}
