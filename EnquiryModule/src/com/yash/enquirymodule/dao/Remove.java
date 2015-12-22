package com.yash.enquirymodule.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.yash.enquirymodule.util.ConnectionProvider;

public class Remove {
	public void remove(HttpServletRequest request,HttpServletResponse response,int del) throws IOException, ServletException {
		Connection connection = ConnectionProvider.getConnection();
		String query = "delete from enquiry where userid=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, del);
			preparedStatement.executeUpdate();
			request.getRequestDispatcher("/View.jsp").forward(request, response);

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
