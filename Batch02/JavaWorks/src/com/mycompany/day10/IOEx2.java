package com.mycompany.day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/// this program shall read the content from file and show it to user 

public class IOEx2 {
	public static void main(String[] args) 
			throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\OnlineTraining\\Notes\\Day07.txt"));
		String temp;
		System.out.println("The Data Got from the file... ");
		while(( temp = br.readLine())!=null){
			System.out.println(temp);
		}
		
		br.close();
	}
}
