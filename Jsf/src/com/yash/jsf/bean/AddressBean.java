package com.yash.jsf.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AddressBean {
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String save()
	{
		
	    String query = "INSERT INTO TEST VALUES(?,?)";
        Connection connection = ConnectionProvider.getConnection();
        PreparedStatement preparedstatement;
        try {
            preparedstatement = connection.prepareStatement(query);
            preparedstatement.setString(1, getName());
            preparedstatement.setInt(2, getSalary());
            preparedstatement.executeUpdate();
            ConnectionProvider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "welcome";
	}
	
}
