package com.yash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.domain.Customer;
import com.yash.user.GettingId;
import com.yash.util.ConnectionProvider;

public class Customerdao {
	static String query = "INSERT INTO CUSTOMER VALUES(?,?,?)";
	static String query1 = "UPDATE CUSTOMER SET NAME=? WHERE ID=?";
	static String query2 = "DELETE FROM CUSTOMER WHERE ID=?";
	static String query3 = "SELECT * FROM CUSTOMER";
	static PreparedStatement preparestatement;
	static List<Customer> list;
	public void save(Customer customer) {
		Connection connection = ConnectionProvider.getConnection();

		try {
			// Insert Operation
			preparestatement = connection.prepareStatement(query);
			preparestatement.setInt(1, new GettingId().gettingId());
			preparestatement.setString(2, customer.getName());
			preparestatement.setString(3, customer.getAddress());
			preparestatement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void update(int id, String name) {
		Connection connection = ConnectionProvider.getConnection();
		try {
			// Update Operation
			PreparedStatement preparestatement1 = connection
					.prepareStatement(query1);
			preparestatement1.setString(1, name);
			preparestatement1.setInt(2, id);

			preparestatement1.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void delete(int id) {
		Connection connection = ConnectionProvider.getConnection();
		try {

			// Delete Operation
			PreparedStatement preparestatement2 = connection
					.prepareStatement(query2);
			preparestatement2.setInt(1, (id));
			preparestatement2.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public List<Customer> select() {
		Connection connection = ConnectionProvider.getConnection();
		try {
			// Select Operation
			list=new ArrayList();
			PreparedStatement preparestatement3 = connection
					.prepareStatement(query3);
			
			ResultSet resultSet = preparestatement3.executeQuery();
			while (resultSet.next()) {
				
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("NAME");
				String address = resultSet.getString("ADDRESS");
				list.add(new Customer(id,name,address));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	return list;
	}

}
