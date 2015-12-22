package com.yash.shoppingcart.service;

import com.yash.shoppingcart.domain.Customer;

public interface CustomerServiceIntf {
	public void addCustomer(Customer customer);
	public int authenticateCustomer(String username,String password);

}
