package com.sdettraining.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
	
	static Connection conn; 
	public PreparedStatement ps, ps1, ps2; 
	public ResultSet rs, rs1; 
	
	
	public static Connection getMySqlConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinejdbc", 
					"root", "kanchan");

			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return null;
	}
	
	public static Connection getOracleConnection(){
		return null;
	}
	
	
	
	
	
	
}
