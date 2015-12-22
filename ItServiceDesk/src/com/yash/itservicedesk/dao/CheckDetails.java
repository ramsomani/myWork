package com.yash.itservicedesk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import com.yash.itservicedesk.util.ConnectionProvider;

public class CheckDetails {
	static int i = 0;

	public int check(String email1) {
		String query = "SELECT * FROM SUPPORT ";
		Connection connection = ConnectionProvider.getConnection();

		try {
			PreparedStatement preparestatement = connection.prepareStatement(query);
			ResultSet resultSet = preparestatement.executeQuery();
			while (resultSet.next()) {
				String email = resultSet.getString("email");
				if (email.equals(email1)) {
					i++;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}
}
