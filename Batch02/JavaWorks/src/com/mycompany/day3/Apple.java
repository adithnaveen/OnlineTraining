package com.mycompany.day3;

public class Apple {
	private int mobileId; 
	// access specifier 
	// the class -> pascal casing are for class 
	// where the variables start with upper case 
	// and next word first char is upper case 
	
	// the variable -> camel casing
	// it starts with lower case, next words 
	// first character is upper case 
	
	// apple has a screen 
	private Screen screen; 
	private Camera camera;
	
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	} 
	
	
}
