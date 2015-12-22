package com.yash.util;


import java.sql.*;

public class ConnectionProvider {
	
		static  private String url="jdbc:mysql://localhost:3306/employee";
		static private String user="root";
		static private String password="root";
		static private Connection connection;
		public static Connection getConnection()
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url,user,password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 
		 return connection;
		}
		
		public static void close()
		{
			 try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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


