package com.sdettraining.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sdettraining.connection.GetConnection;
import com.sdettraining.entity.Account;
import com.sdettraining.interfaces.IAccountDAO;

public class AccountDAO implements IAccountDAO{

	@Override
	public boolean insertAccount(Account account) {
		// positional parameters starts from 1 
		// arrays will start from 0 
		// resultsets or iterators starts from -1 
		String sql ="insert into account values(?, ?,?,?)";
		GetConnection gc = new GetConnection(); 
		
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql); 
			gc.ps.setInt(1, account.getAccNo());
			gc.ps.setString(2, account.getCustomerName());
			gc.ps.setDouble(3, account.getAccBal());
			gc.ps.setString(4, account.getCustomerEmail());
			
			int returnVal= gc.ps.executeUpdate();
			if(returnVal >0){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean deleteAccount(int accountId) {
		// on hold 
		return false;
	}

	@Override
	public boolean updateAccount(int accountId, double newBalance) {
		String sql="update account set accbalance =? where accountid =?";
		
		GetConnection gc = new GetConnection(); 
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql); 
			gc.ps.setDouble(1, newBalance);
			gc.ps.setInt(2, accountId);

			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}

	@Override
	public Account getAccount(int accountId) {
		String sql="select accountid, customername, accbalance, customeremail "
				+ "from account where accountid = ? ";
		
		GetConnection gc = new GetConnection(); 
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, accountId);
			
			gc.rs = gc.ps.executeQuery();
			
			if(gc.rs.next()){
				
				Account account = new Account(); 
				account.setAccNo(gc.rs.getInt(1));
				account.setCustomerName(gc.rs.getString(2));
				account.setAccBal(gc.rs.getDouble(3));
				account.setCustomerEmail(gc.rs.getString(4));
				
				return account; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return null;
	}

	@Override
	public List<Account> getAllAccounts() {
		String sql ="select accountid, customername, accbalance, customeremail from account";
		GetConnection gc = new GetConnection(); 
		List<Account> list = new ArrayList<Account>(); 
		
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql); 
			gc.rs = gc.ps.executeQuery(); 
			
			while(gc.rs.next()){

				Account account = new Account(); 
				account.setAccNo(gc.rs.getInt(1));
				account.setCustomerName(gc.rs.getString(2));
				account.setAccBal(gc.rs.getDouble(3));
				account.setCustomerEmail(gc.rs.getString(4));
				
				list.add(account);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

}
