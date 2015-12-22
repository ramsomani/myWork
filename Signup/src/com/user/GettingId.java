package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.ConnectionProvider;



public class GettingId {
	public static int gettingId() {
		Connection connection = ConnectionProvider.getConnection();
		int id = 0;
		String query = "SELECT * FROM REGISTER";
	
		try {
			PreparedStatement preparestatement = connection
					.prepareStatement(query);
			// ResultSet resultSet = preparestatement.getResultSet();
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
	
	public static int gettingAccId() {
		Connection connection = ConnectionProvider.getConnection();
		int id = 0;
		String query = "SELECT * FROM BANK";
	
		try {
			PreparedStatement preparestatement = connection
					.prepareStatement(query);
			// ResultSet resultSet = preparestatement.getResultSet();
			ResultSet resultSet = preparestatement.executeQuery();
			while (resultSet.next()) {
				if (resultSet.last()) {
					id = resultSet.getInt("ACCID");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ++id;

	}
}
