package com.yash.shoppingcart.service;

import java.util.List;

import com.yash.shoppingcart.domain.Product;

public interface ProductServiceIntf {
	public void addProduct(Product product,String username);
	public List getDetails(String username);
	public int count(String username);
}
