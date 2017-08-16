package com.mycompany.day3;

//Java Bean 
//a java bean class is the one which has 
//private variables 
//default constructor (if you dont create the one 
//then compiler will give) 
//public getters and setters 

public class Speaker {
	private int volLevels;
	private String soundType; // mono, dolby, stereo 
	
	public final int getVolLevels() {
		return volLevels;
	}
	public final void setVolLevels(int volLevels) {
		this.volLevels = volLevels;
	}
	public final String getSoundType() {
		return soundType;
	}
	public final void setSoundType(String soundType) {
		this.soundType = soundType;
	}
	@Override
	public String toString() {
		return this.volLevels +", " + this.soundType;
	}
	
	
	
}
