package com.sdettrainign.day09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEx01 {
	public static void main(String[] args) {
		try {
			File file = new File("sample.txt"); 
			FileReader fileReader = new FileReader(file); 
			BufferedReader br = new BufferedReader(fileReader);
			
			String str; 
			
			while((str = br.readLine())!=null){
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		
	}
}
