package com.sdettraining.day06;

import java.io.FileNotFoundException;

public class ExceptionEx03 {
	
	public static void giveHike(String name, double hikeSal) throws FileNotFoundException{
		if(hikeSal>750){
			System.out.println("I'm Happy for Hike " + hikeSal +", by :" + name);
		}else if(hikeSal> 400 && hikeSal <= 750){
			throw new RuntimeException("Sorry Please let me know why it is less By : " + 
					name +", for Hike  " + hikeSal);
		}else if(hikeSal > 200 &&  hikeSal <= 400){
			throw new ArithmeticException("Sorry this is too less By : " + 
					name +", for Hike  " + hikeSal);
		}else if(hikeSal <=200){
			throw new FileNotFoundException("Oh Sorry very less i'm going to quit " 
					+ name);
		}
	}
	public static void main(String[] args) {
		try{
		giveHike("Harry", 12);
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}catch(RuntimeException re){
			re.printStackTrace();
		} catch(FileNotFoundException fnf){
			fnf.printStackTrace();
			System.out.println(fnf);
			System.out.println(fnf.getMessage());
		}
		System.out.println("some other business logic goes here ");
	}
}
