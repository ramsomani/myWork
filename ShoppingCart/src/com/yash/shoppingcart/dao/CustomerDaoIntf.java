package com.yash.shoppingcart.dao;

import java.sql.ResultSet;

public interface CustomerDaoIntf {
	public ResultSet select(String query);
	public void update(String query);
}
