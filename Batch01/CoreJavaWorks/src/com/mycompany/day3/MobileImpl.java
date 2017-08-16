package com.mycompany.day3;

public class MobileImpl {
	public static void main(String[] args) {
		Mobile appleMobile = new Mobile();
		
		Display iphoneDisplay = new Display();
		iphoneDisplay.setBre(3);
		iphoneDisplay.setLen(5);
		iphoneDisplay.setType("Gorilla Glass");
		
		Speaker stereoSpeaker = new Speaker();
		stereoSpeaker.setVolLevels(30);
		stereoSpeaker.setSoundType("Stereo");
		
		appleMobile.setMobileModel("iPhone 6s");
		appleMobile.setMobileDisplay(iphoneDisplay);
		appleMobile.setMobileSpeaker(stereoSpeaker);
		
		
//		System.out.println("Model " + appleMobile.getMobileModel());
//		System.out.println("Apple Display Lengh " +
//				appleMobile.getMobileDisplay().getLen());
//		System.out.println("Apple Display Bredth " +
//				appleMobile.getMobileDisplay().getBre());
//		System.out.println("Apple Display Type " + 
//				appleMobile.getMobileDisplay().getType());
		System.out.println(appleMobile);  // appleMobile.toString()
	}
}
