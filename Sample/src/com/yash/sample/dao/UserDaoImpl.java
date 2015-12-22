package com.yash.sample.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.EJB;
import javax.inject.Inject;

import com.yash.sample.bean.UserServiceBean2LocalLocal;

public class UserDaoImpl implements UserDao {
	@EJB
	UserServiceBean2LocalLocal getcon;
	@Override
	public ResultSet select(String query) {
		ResultSet resultset = null;
		
		PreparedStatement preparedStatement;
		try {
			Connection connection=  getcon.getConnection();
			preparedStatement = connection.prepareStatement(query);
			 resultset = preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultset;

	}

	@Override
	public void update(String query) {
		try {
			Connection connection=  getcon.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
