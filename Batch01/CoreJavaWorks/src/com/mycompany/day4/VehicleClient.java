package com.mycompany.day4;

public class VehicleClient {
	public static void main(String[] args) {
		JBLMusicPlayer musicPlayer = new JBLMusicPlayer();
		SonySpeaker speaker = new SonySpeaker();
		musicPlayer.setSpeaker(speaker);
		
		BMW myBmw = new BMW(4, 4, 2, musicPlayer);
		
		System.out.println( "Min Vol levels : " +myBmw.getMusicPlayer().getSpeaker().getMinVolLevel());
		System.out.println("Max Vol levels : " + myBmw.getMusicPlayer().getSpeaker().getMaxVolLevel());
		
		myBmw.accelarate();
		myBmw.accelarate();
		myBmw.accelarate();
		myBmw.accelarate();
		myBmw.accelarate();
		myBmw.accelarate();
		myBmw.accelarate();
		
		myBmw.brake();
		myBmw.brake();
		myBmw.brake();
		myBmw.brake();
		
		System.out.println("No Of Doors : " + myBmw.noOfDoors);
	}
}
