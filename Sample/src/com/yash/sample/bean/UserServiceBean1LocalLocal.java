package com.yash.sample.bean;

import javax.ejb.Local;

import com.yash.sample.domain.User;

@Local
public interface UserServiceBean1LocalLocal {

	User checkUser(User user);
	public void logout();
}
