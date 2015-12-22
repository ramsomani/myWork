package com.yash.studentmanagement.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.studentmanagement.dao.StudentDao;
import com.yash.studentmanagement.domain.StudentPersonalInformation;

public class StudentPersonalService {

	
	StudentDao studentDao = new StudentDao();

	public StudentPersonalInformation getById(int studentId) {
		String query = "select *from candidate_per where s_id= " + studentId;
		ResultSet resultSet = studentDao.select(query);
		StudentPersonalInformation product = new StudentPersonalInformation();
		try {
			while (resultSet.next()) {
				product.setS_id(resultSet.getInt(1));
				product.setName(resultSet.getString(2));
				product.setCity(resultSet.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}

	public List<StudentPersonalInformation> getByCity(String studentCity) {
		List<StudentPersonalInformation> list = new ArrayList<StudentPersonalInformation>();
		String query = "select *from candidate_per where city= '" +studentCity+ "'"; 
		ResultSet resultSet = studentDao.select(query);
		
		try {
			while (resultSet.next()) {
				StudentPersonalInformation product = new StudentPersonalInformation();
				product.setS_id(resultSet.getInt(1));
				product.setName(resultSet.getString(2));
				product.setCity(resultSet.getString(3));
				list.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
