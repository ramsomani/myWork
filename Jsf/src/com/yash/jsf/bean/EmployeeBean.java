package com.yash.jsf.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
@ManagedBean
@RequestScoped
public class EmployeeBean {
	private String name;
	private String contact;
	private String gender;
	private String email;
	private String address;
	private String dob;
	private int years_of_experience;
	private String[] technologies_known;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getYears_of_experience() {
		return years_of_experience;
	}

	public void setYears_of_experience(int years_of_experience) {
		this.years_of_experience = years_of_experience;
	}

	public String[] getTechnologies_known() {
		return technologies_known;
	}

	public void setTechnologies_known(String[] technologies_known) {
		this.technologies_known = technologies_known;
	}

	public void save()
	{
		String str=String.join("," , technologies_known);
	    String query = "INSERT INTO EMPLOYEE VALUES(?,?,?,?,?,?,?,?)";
        Connection connection = ConnectionProvider.getConnection();
        PreparedStatement preparedstatement;
        try {
            preparedstatement = connection.prepareStatement(query);
            preparedstatement.setString(1, getName());
            preparedstatement.setString(2, getContact());
            preparedstatement.setString(3, getGender());
            preparedstatement.setString(4, getEmail());
            preparedstatement.setString(5, getAddress());
            preparedstatement.setString(6, getDob());
            preparedstatement.setInt(7, getYears_of_experience());
            preparedstatement.setString(8,str);
            preparedstatement.executeUpdate();
            ConnectionProvider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
	}
	
	
	
	}

