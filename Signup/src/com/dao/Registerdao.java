package com.dao;
import com.user.*;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.domain.Account;
import com.domain.Register;
import com.user.GettingId;
import com.util.ConnectionProvider;


public class Registerdao {

	static PreparedStatement preparestatement;

	public void save(Register register) {
		String query = "INSERT INTO REGISTER VALUES(?,?,?)";
		
		Connection connection = ConnectionProvider.getConnection();

		try {

			preparestatement = connection.prepareStatement(query);
			preparestatement.setInt(1, GettingId.gettingId());
			preparestatement.setString(2, register.getName());
			preparestatement.setString(3, register.getPassword());
			preparestatement.executeUpdate();
			

		} catch (Exception e) {
			System.out.println(e);
			
		}

	}
}
