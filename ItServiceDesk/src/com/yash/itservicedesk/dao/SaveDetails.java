package com.yash.itservicedesk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.yash.itservicedesk.domain.Register;
import com.yash.itservicedesk.util.ConnectionProvider;

public class SaveDetails {
	static PreparedStatement preparestatement ;
	
	public static void save(Register register) {
		String query = "INSERT INTO REGISTER VALUES(?,?,?)";
		Connection connection = ConnectionProvider.getConnection();

		try {
			
			preparestatement = connection.prepareStatement(query);
			preparestatement.setString(1, register.getName());
			preparestatement.setString(2, register.getLname());
			preparestatement.setString(3, register.getContact());
			preparestatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
