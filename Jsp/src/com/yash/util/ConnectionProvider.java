package com.yash.util;


import java.sql.*;

public class ConnectionProvider {
	
		static  private String url="jdbc:mysql://localhost:3306/techsupport";
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
	}


