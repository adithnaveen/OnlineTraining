package com.mycomp.client;

import com.mycomp.beans.CustomerBean;
import com.mycomp.dao.CustomerDAO;
import com.mycomp.interfaces.ICustomerDAO;

public class CustomerClient {
	public static void main(String[] args) {
		CustomerBean customerBean = new CustomerBean();
		
		customerBean.setCustId(103);
		customerBean.setCustName("Luis");
		customerBean.setCustSal(7000);
		customerBean.setCustEmail("luis@gmail.com");
		
		// this is valid because CustomerDAO implements ICustomerDAO
		ICustomerDAO customerDao = new CustomerDAO();
		/*boolean flag = customerDao.insertCustomer(customerBean);
		
		if(flag){
			System.out.println("Customer Inserted... ");
		}else{
			System.out.println("Sorry Customer Not Inserted...");
		}
		*/
		
		
		// System.out.println(customerDao.deleteCustomer(101)?"Record Deleted":"Sorry Record Not Found");
		
//		CustomerBean customer = customerDao.getCustomer(102);
//		
//		System.out.println("Customer id : " + customer.getCustId());
//		System.out.println("Customer Name : " + customer.getCustName());
//		System.out.println("Customer Salary : " + customer.getCustSal());
//		System.out.println("Customer Email : " + customer.getCustEmail());
		
		
		
//		for(CustomerBean temp : customerDao.getAllCustoemrs()){
//			System.out.println("Customer id : " + temp.getCustId());
//			System.out.println("Customer Name : " + temp.getCustName());
//			System.out.println("Customer Salary : " + temp.getCustSal());
//			System.out.println("Customer Email : " + temp.getCustEmail());
//			
//			System.out.println("--------------------------------------");
//			
//		}
		
		
		
		System.out.println(customerDao.updateCustomer(102, 12000));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
