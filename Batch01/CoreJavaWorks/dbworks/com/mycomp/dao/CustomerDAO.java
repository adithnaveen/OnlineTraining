package com.mycomp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mycomp.beans.CustomerBean;
import com.mycomp.connection.GetConnection;
import com.mycomp.interfaces.ICustomerDAO;

public class CustomerDAO  implements ICustomerDAO{

	@Override
	public boolean insertCustomer(CustomerBean customer) {
		String sql="insert into customer values(?,?,?,?)";
		
		try {
			GetConnection getConnection = new GetConnection();
			
			// getMysqlConn -> will give connection(road), place where it is stored, 
			// username, password with this information we are passing sql statement 
			// in preparedstatement bucket 
			getConnection.ps = GetConnection.getMysqlConn().prepareStatement(sql);
			getConnection.ps.setInt(1, customer.getCustId());
			getConnection.ps.setString(2, customer.getCustName());
			getConnection.ps.setDouble(3, customer.getCustSal());
			getConnection.ps.setString(4, customer.getCustEmail());
			
			int noOfRowsAffected = getConnection.ps.executeUpdate();
			
			if(noOfRowsAffected >0){
				return true;
			}else{
				return false;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteCustomer(int custId) {

		String sql ="delete from customer where cid=?";
		try {
			GetConnection getConnection = new GetConnection();
			getConnection.ps = GetConnection.getMysqlConn().prepareStatement(sql);
			getConnection.ps.setInt(1, custId);
			
			int noOfRowsAffected = getConnection.ps.executeUpdate();
			
			if(noOfRowsAffected>0){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateCustomer(int custId, double newSal) {
		String sql="update customer set cincome = ? where cid =?";
		
		GetConnection getMysqlConnection = new GetConnection();
		
		try {
			getMysqlConnection.ps = GetConnection.getMysqlConn().prepareStatement(sql);
			getMysqlConnection.ps.setDouble(1, newSal);
			getMysqlConnection.ps.setInt(2, custId);
			
			if(getMysqlConnection.ps.executeUpdate()>0){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public CustomerBean getCustomer(int custId) {

		String sql="select * from customer where cid =?";
		try {
			GetConnection getConnection = new GetConnection();
			getConnection.ps = GetConnection.getMysqlConn().prepareStatement(sql);
			getConnection.ps.setInt(1, custId);
			
			getConnection.rs = getConnection.ps.executeQuery();
			// if record exists then execute if condition else dont 
			if(getConnection.rs.next()){
				CustomerBean customer = new CustomerBean();
				
				customer.setCustId(getConnection.rs.getInt(1));
				customer.setCustName(getConnection.rs.getString(2));
				customer.setCustSal(getConnection.rs.getDouble(3));
				customer.setCustEmail(getConnection.rs.getString(4));
				
				return customer;
			}else {
				System.out.println("Sorry No Records Matched... ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		return null;
	}

	@Override
	public List<CustomerBean> getAllCustoemrs() {
		// this statement may give more than 1 record 
		String sql="select * from customer";
		List<CustomerBean> customerList =   new ArrayList<CustomerBean>();
		
		try {
			GetConnection getConnection = new GetConnection();
			getConnection.ps = GetConnection.getMysqlConn().prepareStatement(sql);
			
			getConnection.rs = getConnection.ps.executeQuery();
			
			// so i use while, since we dont know how many records will be there 
			
			while(getConnection.rs.next()){
				CustomerBean temp  = new CustomerBean();
				
				temp.setCustId(getConnection.rs.getInt(1));
				temp.setCustName(getConnection.rs.getString(2));
				temp.setCustSal(getConnection.rs.getDouble(3));
				temp.setCustEmail(getConnection.rs.getString(4));
				customerList.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customerList;
	}

}
