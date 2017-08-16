package com.mycompany.day3;

// this is assembly place 
public class Mobile {
	private String mobileModel; 
	private Speaker mobileSpeaker; 
	private Display mobileDisplay;
	
	
	public final String getMobileModel() {
		return mobileModel;
	}
	public final void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}
	
	
	public final Speaker getMobileSpeaker() {
		return mobileSpeaker;
	}
	public final void setMobileSpeaker(Speaker mobileSpeaker) {
		this.mobileSpeaker = mobileSpeaker;
	}
	
	
	public final Display getMobileDisplay() {
		return mobileDisplay;
	}
	public final void setMobileDisplay(Display mobileDisplay) {
		this.mobileDisplay = mobileDisplay;
	}
	
	
	@Override
	public String toString() {
		return this.mobileModel +", " + this.mobileDisplay +", "+ this.mobileSpeaker;
	}
	
	
	
}
