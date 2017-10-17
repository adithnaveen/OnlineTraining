package com.mycompany.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.beans.EmployeeBean;
import com.mycompany.connection.GetConnection;

public class EmployeeDAO {

	// 1. Index position - 0
	// 2. iterators -1
	// 3. Positional parameters -> 1
	public boolean insertEmployee(EmployeeBean employeeBean){
		String sql="insert into employee values(?,?,?,?)";
		
		// one object is constructed in the heap 
		// and since the BTF, static 
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);

			gc.ps.setInt(1, employeeBean.getEmpId());
			gc.ps.setString(2, employeeBean.getEmpName());
			gc.ps.setDouble(3, employeeBean.getEmpSal());
			gc.ps.setString(4, employeeBean.getEmail());
			
			if(gc.ps.executeUpdate()>0){
				return true; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false; 
	}

	
	public boolean deleteEmployee(int empId){
		String sql="delete from employee where empid=?";
		
		GetConnection gc  = new GetConnection();
		
		try {
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, empId);
			
			if(gc.ps.executeUpdate()>0){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	public boolean updateEmployee(int empId, double empSal){
		GetConnection gc  = new GetConnection();
		
		String sql="update employee set empsal =? where empid =?";
		
		try {
			// user name, pwd, and when to keep the data (ipaddress)
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setDouble(1, empSal);
			gc.ps.setInt(2, empId);
			
			if(gc.ps.executeUpdate()>0){
				return true; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	
	public EmployeeBean getEmployee(int empId){
		String sql="select empid, empname, empsal, email from employee where empid=?";
		
		GetConnection gc  =new GetConnection();
		
		
			try {
				gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
				gc.ps.setInt(1, empId);
				
				gc.resultSet = gc.ps.executeQuery();
				
				if(gc.resultSet.next()){
					EmployeeBean temp = new EmployeeBean();
					temp.setEmpId(gc.resultSet.getInt(1));
					temp.setEmpName(gc.resultSet.getString(2));
					temp.setEmpSal(gc.resultSet.getDouble(3));
					temp.setEmail(gc.resultSet.getString(4));
					return temp; 
					
				} else{
					System.out.println("Sorry Record Not Found");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
	
	
	public List<EmployeeBean> getAllEmps(){
		String sql ="select empid, empname, empsal, email from employee";
		
		List<EmployeeBean> list = new ArrayList<EmployeeBean>();
		GetConnection gc = new GetConnection();
		
		try {
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			
			gc.resultSet = gc.ps.executeQuery();
			
			while(gc.resultSet.next()){
				EmployeeBean temp = new EmployeeBean();
				temp.setEmpId(gc.resultSet.getInt(1));
				temp.setEmpName(gc.resultSet.getString(2));
				temp.setEmpSal(gc.resultSet.getDouble(3));
				temp.setEmail(gc.resultSet.getString(4));
				
				list.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

