package com.mycomp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Naveen
 * @see This class shall have the connection information about the DB/s ,
 * typically this package shall have only 1 class 
 */
public class GetConnection {
	private static Connection conn; 
	public PreparedStatement ps, ps1, ps2; // many here 
	public ResultSet rs; 
	
	
	// db Information 
	static String url="jdbc:mysql://localhost/onlinedb";
	static String username="root";
	static String password="kanchan";
	
	
	public static Connection getMysqlConn(){
		// we are invoking a class which is written by 3rd party vendor 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return null;
	}
	
}
