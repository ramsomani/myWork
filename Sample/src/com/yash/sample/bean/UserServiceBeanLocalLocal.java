package com.yash.sample.bean;

import javax.ejb.Local;

import com.yash.sample.domain.User;

@Local
public interface UserServiceBeanLocalLocal {
	public int checkUser(User user);
}
