package com.mycompany.day2;



public class TraineeImpl {
	public static void main(String[] args) {
		Trainee padma = new Trainee();
		Trainee mohan = new Trainee();
		
		
		padma.setTraineeId(101);
		padma.setSubject("Computers");
		padma.giveMarks(-70);
		
		
		System.out.println("Trainee Id " + padma.getTraineeId());
		System.out.println("Subject is " + padma.getSubject());
		System.out.println("Marks is " + padma.getMarks());
	}
}
