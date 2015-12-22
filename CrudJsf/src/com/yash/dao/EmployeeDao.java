package com.yash.dao;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import com.yash.domain.Employee;

public class EmployeeDao {

	@Resource(lookup="java:/jboos/datasources/curd")
	DataSource datasource;

	public void addEmployee(Employee employee){
		try {
			System.out.println(datasource.getConnection());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	
	
}
