package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.domain.Register;
import com.util.ConnectionProvider;


public class Logindao {

	int str = 0;

	static String query = "SELECT * FROM REGISTER WHERE NAME=? AND PASSWORD=?";
	static PreparedStatement preparestatement;

	public int check(Register register) {
		Connection connection = ConnectionProvider.getConnection();
		try {
			PreparedStatement preparestatement = connection
					.prepareStatement(query);
			preparestatement.setString(1, register.getName());
			preparestatement.setString(2, register.getPassword());
			ResultSet resultSet = preparestatement.executeQuery();
			while (resultSet.next()) {
				String name = resultSet.getString("NAME");
				String password = resultSet.getString("PASSWORD");

				if (name.equals(register.getName())
						&& password.equals(register.getPassword())) {
					str = 1;
				}

			}

		} catch (Exception e) {

		}
		return str;
	}
}
