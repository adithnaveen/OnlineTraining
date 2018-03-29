package com.sdettrainign.day09;

import java.io.File;
import java.io.IOException;

public class FileEx01 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Naveen\\Desktop\\sample.txt"); 
		
		if(file.exists()){
			System.out.println("File exists " );
			System.out.println("File read Permission " + file.canRead());
			System.out.println("File Write Permission " + file.canWrite());
			System.out.println("Absolute path " + file.getAbsolutePath());
			file.setWritable(false); 
		}else{
			System.out.println("File Not Exists ");
			file.createNewFile();
		}
	}
}
