package com.yash.shoppingcart.service;





import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.shoppingcart.dao.CustomerDaoImpl;
import com.yash.shoppingcart.dao.CustomerDaoIntf;
import com.yash.shoppingcart.domain.Customer;


public class CustomerServiceImpl implements CustomerServiceIntf{
	CustomerDaoIntf customerDaoIntf=new CustomerDaoImpl();
	
	@Override
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO CUSTOMER(NAME,CONTACT,EMAIL,ADDRESS,USERNAME,PASSWORD) VALUES ('"
	                + customer.getName()
	                + "' ,  "
	                + customer.getContact()
	                + "  ,  '"
	                + customer.getEmail()
	                + "'  ,  '"
	                + customer.getAddress()
	                + "'  ,   '"
	                + customer.getUsername()
	                + "' ,  '"
	                + customer.getPassword() + "')";

	        customerDaoIntf.update(sql);
	}

	@Override
	public int authenticateCustomer(String username, String password) {
		 int i=0;
		String sql = "SELECT USERNAME,PASSWORD FROM CUSTOMER WHERE USERNAME='"
                + username + "' AND PASSWORD='" + password + "'";
		ResultSet resultSet=null;
       resultSet= customerDaoIntf.select(sql);
       
       try {
		if(resultSet.next())
		   {
			   ++i;
		   }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
    return i;
	}



}
