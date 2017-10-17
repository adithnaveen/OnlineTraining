package com.mycompany.day2;
class Trainee{
	// if you dont write it then compiler will create 
	// with this help the object in the world is created 
	public Trainee(){}
	
	private int traineeId;
	private String subject; 
	private int marks; 
	
	// we have to stop the user to put wrong values 
	
	public void giveMarks(int newMarks){
		if(newMarks < 35){
			System.out.println("Sorry marks cannot be less than 35 and set to 35");
			marks = 35;
		}else{
			marks = newMarks;
		}
	}

	public void setTraineeId(int tid){
		traineeId = tid;
	}
	
	public void setSubject(String subject){
		this.subject = subject; 
	}

	public int getTraineeId(){
		return this.traineeId;
	}
	
	public String getSubject(){
		return this.subject;
	}
	
	public int getMarks(){
		return this.marks;
	}

}
