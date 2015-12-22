package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.domain.Account;
import com.user.GettingId;
import com.util.ConnectionProvider;


public class Bankdao {
	static PreparedStatement preparestatement;
	public void save(Account account)
	{
		String query1 = "INSERT INTO BANK VALUES(?,?)";
		Connection connection = ConnectionProvider.getConnection();
		try {
			preparestatement = connection.prepareStatement(query1);
			preparestatement.setInt(1,  GettingId.gettingAccId());
			preparestatement.setInt(2, account.getAccBalance());
			preparestatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
