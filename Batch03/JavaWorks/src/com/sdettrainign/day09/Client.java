package com.sdettrainign.day09;

public class Client {
	public static void main(String[] args) {
		try {
			Class.forName("com.sdettrainign.day09.MySql");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
