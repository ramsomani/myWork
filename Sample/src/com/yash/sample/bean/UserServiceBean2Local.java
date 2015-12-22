package com.yash.sample.bean;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;


@Singleton
@LocalBean
public class UserServiceBean2Local implements UserServiceBean2LocalLocal {

	 private String url="jdbc:mysql://localhost:3306/employee";
	 private String user="root";
	 private String password="root";
	 private Connection connection;
	
	 @Override
	public Connection getConnection() {
		 try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url,user,password);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		 return connection;
	}
	 
	 

}
