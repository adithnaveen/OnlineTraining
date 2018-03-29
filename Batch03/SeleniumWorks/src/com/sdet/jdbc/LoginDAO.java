package com.sdet.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {
	public List<LoginBean> getAllLoginUsers(){
		String sql="select username, password from loginvalues";
		
		GetConnection gc = new GetConnection(); 
		List<LoginBean> list = new ArrayList<LoginBean>();
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql); 
			
			gc.rs = gc.ps.executeQuery();
			
			while(gc.rs.next()){
				LoginBean temp = new LoginBean(); 
				temp.setUserName(gc.rs.getString(1));
				temp.setPassword(gc.rs.getString(2));
				
				list.add(temp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return list; 
	}
	
	public static void main(String[] args) {
		for(LoginBean temp : new LoginDAO().getAllLoginUsers()){
			System.out.println(temp.getUserName() +", " + temp.getPassword());
		}
	}
}
