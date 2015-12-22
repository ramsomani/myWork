package com.yash.sample.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.yash.sample.dao.UserDao;
import com.yash.sample.domain.User;


@Stateless
@LocalBean
public class UserServiceBeanLocal implements UserServiceBeanLocalLocal {

    @Inject
     UserDao userDao;
    public UserServiceBeanLocal() {
       
    }

	@Override
	public int checkUser(User user) {
		System.out.println("hii from checkuser");
		int i=0;
		String query="Select name,contact from demo where name='" +user.getName()+ "' AND contact='" +user.getContact()+ "'";
		ResultSet resultSet=userDao.select(query);
			try {
				while(resultSet.next())
				{
					i++;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return i;
	}

}
