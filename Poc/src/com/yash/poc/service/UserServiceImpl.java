package com.yash.poc.service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.yash.poc.domain.User;
import com.yash.poc.userdao.UserDao;


public class UserServiceImpl implements UserServiceIntf{
	
	@Inject 
	UserDao userDao;
	@Override
	public void CreateUser(User user) {
		String query = "INSERT INTO USER VALUES('"+user.getId()+"','"+user.getName()+"','"+user.getLocation()+"')";
		userDao.update(query);
	}
	
	@Override
	public void DeleteUser(int id) {
		String query="DELETE FROM USER WHERE USER_ID="+id+"";
		System.out.println(query);
		userDao.update(query);
	}

	@Override
	public void UpdateUser(User user) {
		String query="UPDATE USER SET USER_ID="+user.getId()+",USER_NAME='"+user.getName()+"',USER_LOCATION='"+user.getLocation()+"'WHERE USER_ID="+user.getId()+"";
		System.out.println(query);
		userDao.update(query);
		
	}
	
	@Override
	public List ShowUser() {
		ResultSet rs;
		List<User> list;
		list=new ArrayList<User>();
		String query = "SELECT * FROM USER ";
		rs=userDao.select(query);
		try {
			while (rs.next()) {
				User user=new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setLocation(rs.getString(3));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	

}
