package com.mycompany.day3;

public class Client {
	public static void main(String[] args) {
		Apple apple5se = new Apple();
		
		apple5se.setMobileId(101);
		
		Screen appleScreen = new Screen();
		appleScreen.setBre(3);
		appleScreen.setLen(6);
		appleScreen.setGlassType("Gorilla");
		
		apple5se.setScreen(appleScreen);
		
		Camera appleCamera = new Camera();
		appleCamera.setType("Mega Pixel");
		appleCamera.setPixel(10);
		
		apple5se.setCamera(appleCamera);
		
	 /////////////////////////////////////////////////////
		
		System.out.println("Mobile id is " + apple5se.getMobileId());
		System.out.println("Screen len  is " + apple5se.getScreen().getLen());
		System.out.println("Screen Bre is " + apple5se.getScreen().getBre());
		System.out.println("Screen glass Type " + apple5se.getScreen().getGlassType());
		
		
		System.out.println("Camera Type is " + apple5se.getCamera().getType());
		System.out.println("Camera Pixel is " + apple5se.getCamera().getPixel());
	}
}
