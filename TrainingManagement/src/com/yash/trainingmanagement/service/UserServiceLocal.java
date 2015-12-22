package com.yash.trainingmanagement.service;

import java.sql.SQLException;

import javax.ejb.Local;


import com.yash.trainingmanagement.domain.User;


@Local
public interface UserServiceLocal {
	public void register(User user);
	public String authenticate(String username,String password) throws SQLException;
	public User getUserName(String username, String password);
}
