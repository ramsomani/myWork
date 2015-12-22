package com.yash.sample.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.LocalBean;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.inject.Inject;

import com.yash.sample.dao.UserDao;
import com.yash.sample.domain.User;

/**
 * Session Bean implementation class UserServiceBean1Local
 */
@Stateful
@LocalBean
public class UserServiceBean1Local implements UserServiceBean1LocalLocal {
	
  @Inject
  UserDao userDao;

	@Override
	public User checkUser(User user) {
		User user1=null;
		System.out.println("hii from checkuser");
		
		String query="Select name,contact from demo where name='" +user.getName()+ "' AND contact='" +user.getContact()+ "'";
		ResultSet resultSet=userDao.select(query);
			try {
				while(resultSet.next())
				{
				user1=new User();
				user1.setName(resultSet.getString(1));
				user1.setContact(resultSet.getInt(2));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return user1;
	}

	@Remove
	public void logout() {

	}

	
	
}
