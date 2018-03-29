package com.sdettraining.interfaces;

import java.util.List;

import com.sdettraining.entity.Account;

public interface IAccountDAO {
	// CRUD 
	
	public boolean insertAccount(Account account);
	
	public boolean deleteAccount(int accountId); 
	
	public boolean updateAccount(int accountId, double newBalance); 
	
	public Account getAccount(int accountId); 
	
	public List<Account> getAllAccounts(); 
}
