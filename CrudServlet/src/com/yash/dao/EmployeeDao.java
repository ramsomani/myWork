package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.domain.Employee;
import com.yash.util.ConnectionProvider;

public class EmployeeDao {

	public static void create(Employee employee) {
		String query="insert into demo(name,contact) values('"+employee.getName()+"','"+employee.getContact()+"')";
		ConnectionProvider.update(query);
	}

	public static Employee display(int str) {
		Employee employee=new Employee();
		String query="select * from demo where id="+str;
		ResultSet resultSet=ConnectionProvider.select(query);
		try {
			while(resultSet.next()){
				employee.setId(Integer.parseInt(resultSet.getString("id")));
				employee.setName(resultSet.getString("name"));
				employee.setContact(resultSet.getString("contact"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return employee;
	}

	public static void update(Employee employee) {
		String query="update demo set name='"+employee.getName()+"',contact='"+employee.getContact()+"' where id="+employee.getId();
		ConnectionProvider.update(query);
		
	}

	public static void delete(int str) {
		String query="delete from demo where id="+str;
		ConnectionProvider.update(query);
		
	}
	
	
}
