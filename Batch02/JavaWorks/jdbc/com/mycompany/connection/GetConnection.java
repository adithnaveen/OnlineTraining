package com.mycompany.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
	static Connection conn; 
	public PreparedStatement ps, ps1, ps2; 
	public ResultSet resultSet; 
	
	public static Connection getMysqlConnection(){
		
		try {
			// setting up road 
			// this class is written by two people 
			// 1. oracle corp 
			// 2. mysql 
			// com.mysql.jdbc.Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// you take the licence to drive 
			conn  = DriverManager.getConnection("jdbc:mysql://localhost/onlinetraining",
						"root", "kanchan");
			return conn; 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
