package com.yash.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.util.ConnectionProvider;

public class GettingId {

	public int gettingId() {
		Connection connection = ConnectionProvider.getConnection();
		int id = 0;
		String query = "SELECT * FROM CUSTOMER";
		try {
			PreparedStatement preparestatement = connection	.prepareStatement(query);
			//ResultSet resultSet = preparestatement.getResultSet();
			ResultSet resultSet = preparestatement.executeQuery();
			while (resultSet.next()) {
				if (resultSet.last()) {
					id = resultSet.getInt("ID");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ++id;

	}
}
