package com.yash.studentmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.studentmanagement.util.ConnectionProvider;



public class StudentDao {

	
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
