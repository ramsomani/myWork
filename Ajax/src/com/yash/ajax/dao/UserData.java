package com.yash.ajax.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.yash.ajax.domain.User;
import com.yash.ajax.util.ConnectionProvider;


public class UserData {
	static User user;
	public static User getData(int id) {
		
		String query = "SELECT * FROM DETAILS WHERE ID=? ";
		Connection connection = ConnectionProvider.getConnection();

		try {
			PreparedStatement preparestatement = connection
					.prepareStatement(query);
			preparestatement.setInt(1, id);
			ResultSet resultSet = preparestatement.executeQuery();
			while (resultSet.next()) {
				int id1 = resultSet.getInt("ID");

				if (id1 == id) {
					user = new User();
					user.setId(id1);
					user.setName(resultSet.getString("NAME"));
					user.setAddress(resultSet.getString("ADDRESS"));
				}
			}

		}

		catch (Exception e) {

		}
		return user;
	}
}
