package com.sdettraining.client;

import java.util.List;

import com.sdettraining.dao.AccountDAO;
import com.sdettraining.entity.Account;
import com.sdettraining.interfaces.IAccountDAO;

public class AccountClient {
	public static void main(String[] args) {
		IAccountDAO dao = new AccountDAO(); 
		
		// insertAccount(dao);
		
		// updateAccount(dao);
		
		// getAccount(dao);
		
		
		List<Account> list = dao.getAllAccounts(); 
		
		
		for(Account temp : list){
			System.out.println(temp);
		}
		
	}

	private static void getAccount(IAccountDAO dao) {
		try {
			Account account = dao.getAccount(104); 

			System.out.println("Account id " + account.getAccNo());
			System.out.println("Customer Name " + account.getCustomerName());
			System.out.println("Account Balance " + account.getAccBal());
			System.out.println("Customer Email " + account.getCustomerEmail());
		} catch (NullPointerException e) {
			System.out.println("Sorry Record Not Found");
		}
	}

	private static void updateAccount(IAccountDAO dao) {
		boolean flag = dao.updateAccount(102, 5544); 
		if(flag){
			System.out.println("Balance is Updated");
		}else{
			System.out.println("Sorry Account Not Found / Balance Not Updated");
		}
	}

	private static void insertAccount(IAccountDAO dao) {
		Account account = new Account();
		account.setAccNo(103);
		account.setAccBal(4000); 
		account.setCustomerName("Kumar");
		account.setCustomerEmail("Kumar@gmail.com");
		
		
		boolean flag = dao.insertAccount(account);
		
		if(flag){
			System.out.println("Record Inserted");
		}else{
			System.out.println("Sorry Not inserted");
		}
	}
}
