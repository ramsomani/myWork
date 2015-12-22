package com.yash.demoejb.bean;

import javax.ejb.Local;

@Local
public interface UserServiceBeanLocal {
	public int convert(int amount);
}
