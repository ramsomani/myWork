package com.yash.trainingmanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionProvider {
	static  private String url="jdbc:mysql://localhost:3306/poc";
	static private String user="root";
	static private String password="root";
	static private Connection connection;
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	 return connection;
	}
	
	public static void close()
	{
		 try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static ResultSet select(String query)
	{
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

	public static void update(String query) 
	{
		 try {
	            Connection connection=  ConnectionProvider.getConnection();
	            PreparedStatement preparedStatement = connection.prepareStatement(query);
	            preparedStatement.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	}
}
