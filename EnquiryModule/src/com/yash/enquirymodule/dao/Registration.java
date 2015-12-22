package com.yash.enquirymodule.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.enquirymodule.domain.Enquiry;
import com.yash.enquirymodule.domain.User;
import com.yash.enquirymodule.util.ConnectionProvider;

public class Registration {
	public void register(HttpServletRequest request,HttpServletResponse response,User user) throws IOException, ServletException {
		Connection connection = ConnectionProvider.getConnection();
		String query = "insert into user(name,email,type,status,username,password) values(?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setInt(3, user.getType());
			preparedStatement.setInt(4, user.getStatus());
			preparedStatement.setString(5, user.getUsername());
			preparedStatement.setString(6, user.getPassword());
			preparedStatement.executeUpdate();
			request.getRequestDispatcher("/Login.jsp").forward(request, response);

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void register1(HttpServletRequest request,HttpServletResponse response,Enquiry enquiry) throws IOException, ServletException {
		Connection connection = ConnectionProvider.getConnection();
		String query = "insert into enquiry(name,userid,email,contact,courses) values(?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, enquiry.getName());
			preparedStatement.setInt(2, enquiry.getUserid());
			preparedStatement.setString(3,enquiry.getEmail());
			preparedStatement.setString(4,enquiry.getContact());
			preparedStatement.setString(5, enquiry.getCourses());
			preparedStatement.executeUpdate();
			request.getRequestDispatcher("/Display.jsp").forward(request, response);

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
