package com.yash.sample.bean;

import java.sql.Connection;

import javax.ejb.Local;

@Local
public interface UserServiceBean2LocalLocal {
		public Connection getConnection();
}
