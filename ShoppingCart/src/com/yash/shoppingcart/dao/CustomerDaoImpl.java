package com.yash.shoppingcart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.shoppingcart.util.ConnectionProvider;

public class CustomerDaoImpl implements CustomerDaoIntf {

	@Override
	public ResultSet select(String query) {
		ResultSet resultset = null;
        
        PreparedStatement preparedStatement;
        try {
            Connection connection=  ConnectionProvider.getConnection();
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
	            Connection connection=  ConnectionProvider.getConnection();
	            PreparedStatement preparedStatement = connection.prepareStatement(query);
	            preparedStatement.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

		
	}

}
