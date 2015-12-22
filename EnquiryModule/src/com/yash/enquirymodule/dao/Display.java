package com.yash.enquirymodule.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.yash.enquirymodule.domain.Enquiry;
import com.yash.enquirymodule.util.ConnectionProvider;



public class Display {
		List<Enquiry> list;
		public List<Enquiry> show(int id) {
			String query = "SELECT * FROM ENQUIRY WHERE USERID=?";
			Connection connection = ConnectionProvider.getConnection();
			try {
				list = new ArrayList<Enquiry>();
				PreparedStatement preparestatement = connection.prepareStatement(query);
				preparestatement.setInt(1, id);
				ResultSet resultSet = preparestatement.executeQuery();
				Enquiry enquiry=new Enquiry();
				while (resultSet.next()) {
					enquiry.setEnquiryid(resultSet.getInt("enquiryid"));
					enquiry.setName(resultSet.getString("name"));
					enquiry.setEmail(resultSet.getString("email"));
					enquiry.setContact(resultSet.getString("contact"));
					enquiry.setCourses(resultSet.getString("courses"));
					list.add(enquiry);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			return list;
		}
	}

