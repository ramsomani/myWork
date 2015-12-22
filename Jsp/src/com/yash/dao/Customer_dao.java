package com.yash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.yash.domain.Customer;
import com.yash.util.ConnectionProvider;

public class Customer_dao {
	static List<Customer> list;
	public static List<Customer> get(String id) {
		String query = "SELECT * FROM DETAILS WHERE ID=? ";
		Connection connection = ConnectionProvider.getConnection();
		Customer customer = new Customer();
		try {
			list = new ArrayList<Customer>();
			PreparedStatement preparestatement = connection
					.prepareStatement(query);
			preparestatement.setString(1, id);
			ResultSet resultSet = preparestatement.executeQuery();
			while (resultSet.next()) {
				String id1 = resultSet.getString("ID");
				if (id1.equalsIgnoreCase(id)) {
					customer.setId(resultSet.getString("ID"));
					customer.setName(resultSet.getString("NAME"));
					customer.setAddress(resultSet.getString("ADDRESS"));
					list.add(customer);
				}
			}
			
		}

		catch (Exception e) {

		}
		return list;
	}

	public static List<Customer> getAll() {
		String query = "SELECT * FROM DETAILS ";
		
		Connection connection = ConnectionProvider.getConnection();
		
		try {
			list = new ArrayList<Customer>();
			PreparedStatement preparestatement = connection
					.prepareStatement(query);
			ResultSet resultSet = preparestatement.executeQuery();
			while (resultSet.next()) {
				Customer customer = new Customer();
				customer.setId(resultSet.getString("ID"));
				customer.setName(resultSet.getString("NAME"));
				customer.setAddress(resultSet.getString("ADDRESS"));
				list.add(customer);
			}

		}

		catch (Exception e) {

		}
		return list;
	}

}
