package com.yash.sample.dao;

import java.sql.ResultSet;

public interface UserDao {
	
	public ResultSet select(String query);
	public void update(String query);

}
