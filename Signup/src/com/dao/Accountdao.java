package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.domain.Account;
import com.util.ConnectionProvider;


public class Accountdao {
	List<Account> list;
	static int balance;

	// DEPOSIT
	public void deposit(int id, int amount) {
		String query = "SELECT * FROM BANK WHERE ACCID=? ";
		Connection connection = ConnectionProvider.getConnection();

		try {
			PreparedStatement preparestatement = connection
					.prepareStatement(query);
			preparestatement.setInt(1, id);
			ResultSet resultSet = preparestatement.executeQuery();
			while (resultSet.next()) {
				int id1 = resultSet.getInt("ACCID");
				if (id1 == id) {
					balance = resultSet.getInt("ACCBALANCE");
					balance = balance + amount;
					SetBalance(id, balance);

				}
			}

		}

		catch (Exception e) {

		}

	}

	private void SetBalance(int id, int balance) {
		String query = "UPDATE BANK SET ACCBALANCE=? WHERE ACCID=?  ";
		Connection connection = ConnectionProvider.getConnection();
		try {
			// Update Operation
			PreparedStatement preparestatement = connection
					.prepareStatement(query);
			preparestatement.setInt(1, balance);
			preparestatement.setInt(2, id);
			preparestatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// WITHDRAW
	public void withdraw(int id, int amount) {
		String query = "SELECT * FROM BANK WHERE ACCID=? ";
		Connection connection = ConnectionProvider.getConnection();
		// Account account=new Account();

		try {
			PreparedStatement preparestatement = connection
					.prepareStatement(query);
			preparestatement.setInt(1, id);
			ResultSet resultSet = preparestatement.executeQuery();
			while (resultSet.next()) {
				int id1 = resultSet.getInt("ACCID");
				if (id1 == id) {
					balance = resultSet.getInt("ACCBALANCE");
					balance = balance - amount;
					SetBalance1(id, balance);

				}
			}
		}

		catch (Exception e) {

		}

	}

	private void SetBalance1(int id, int balance) {
		String query = "UPDATE BANK SET ACCBALANCE=? WHERE ACCID=?  ";
		Connection connection = ConnectionProvider.getConnection();
		try {

			PreparedStatement preparestatement = connection
					.prepareStatement(query);
			preparestatement.setInt(1, balance);
			preparestatement.setInt(2, id);

			preparestatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public List<Account> display(int id) {
		String query = "SELECT * FROM BANK WHERE ACCID=?";
		Connection connection = ConnectionProvider.getConnection();
		try {
			list = new ArrayList<Account>();
			PreparedStatement preparestatement = connection
					.prepareStatement(query);
			preparestatement.setInt(1, id);
			ResultSet resultSet = preparestatement.executeQuery();

			while (resultSet.next()) {
				int id1 = resultSet.getInt("ACCID");
				int bal = resultSet.getInt("ACCBALANCE");
				list.add(new Account(id1, bal));

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public void transfer(int id, int id1, int amount) {

		String query = "INSERT INTO TRANSFER VALUES (?,?)";
		Connection connection = ConnectionProvider.getConnection();

		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setInt(2, id1);
			preparedStatement.executeUpdate();
			withdraw(id, amount);
			deposit(id1, amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List show() {
		String query = "SELECT * FROM BANK";
		Connection connection = ConnectionProvider.getConnection();
		try {
			list = new ArrayList<Account>();
			PreparedStatement preparestatement = connection
					.prepareStatement(query);

			ResultSet resultSet = preparestatement.executeQuery();

			while (resultSet.next()) {
				int id1 = resultSet.getInt("ACCID");
				int bal = resultSet.getInt("ACCBALANCE");
				list.add(new Account(id1, bal));

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
