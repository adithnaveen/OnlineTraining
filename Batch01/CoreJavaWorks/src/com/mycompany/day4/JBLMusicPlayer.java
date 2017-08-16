package com.mycompany.day4;

public class JBLMusicPlayer {
	
	private Speaker speaker; 
	
	
	public void modeOfPlay(){
		System.out.println("music player plays with bluetooth, USB... ");
	}
	
	public void ports(){
		System.out.println("JBL Music player comes with 3 USB ports... ");
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
}
