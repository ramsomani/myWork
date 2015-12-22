package com.yash.enquirymodule.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.yash.enquirymodule.domain.User;
import com.yash.enquirymodule.util.ConnectionProvider;

public class CheckLogin {
	static int i = 0;

	public int check(User user) {
		String query = "select username,password from user";
		Connection connection = ConnectionProvider.getConnection();

		try {
			PreparedStatement preparestatement = connection.prepareStatement(query);
			ResultSet resultSet = preparestatement.executeQuery();
			String username = user.getUsername();
			System.out.println(username);
			String password = user.getPassword();
			System.out.println(password);
			while (resultSet.next()) {
				String username1 = resultSet.getString("username");
				String password1 = resultSet.getString("password");
				if (username.equals(username1) && password.equals(password1)) {
					i++;
				}
			}
		}

		catch (Exception e) {
			System.out.println(e);
		}

		return i;
	}
}
