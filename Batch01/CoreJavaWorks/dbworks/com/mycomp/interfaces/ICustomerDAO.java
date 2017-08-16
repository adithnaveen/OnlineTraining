package com.mycomp.interfaces;

import java.util.List;

import com.mycomp.beans.CustomerBean;

public interface ICustomerDAO {
	// dml 
	public boolean insertCustomer(CustomerBean customer);
	public boolean deleteCustomer(int custId);
	public boolean updateCustomer(int custId, double newSal);
	
	
	// select 
	public CustomerBean getCustomer(int custId);
	public List<CustomerBean> getAllCustoemrs();
}
