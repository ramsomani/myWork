package com.yash.studentmanagement.service;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.studentmanagement.dao.StudentDao;
import com.yash.studentmanagement.domain.StudentEducationalInformation;



public class StudentEducationalService {

	
	List<StudentEducationalInformation> list = new ArrayList<StudentEducationalInformation>();
	StudentDao studentDao = new StudentDao();
	
	public List<StudentEducationalInformation> getByClass10(int studentClass) {
		String query="SELECT p.name, e.m_id, e.standard, e.marks FROM candidate_per p , candidate_edu e WHERE p.s_id=e.s_id AND standard="+studentClass;
		ResultSet resultSet=studentDao.select(query);
		
			try {
				while(resultSet.next())
				{
					StudentEducationalInformation product = new StudentEducationalInformation();
					product.getInformation().setName(resultSet.getString(1));
					product.setM_id(resultSet.getInt(2));
					product.setStandard(resultSet.getInt(3));
					product.setMarks(resultSet.getInt(4));
					System.out.println();
					list.add(product);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return list;
	}
	public List<StudentEducationalInformation> getByClass12(int studentClass) {
		String query="SELECT p.name, e.m_id, e.standard, e.marks FROM candidate_per p , candidate_edu e WHERE p.s_id=e.s_id AND standard="+studentClass;
		ResultSet resultSet=studentDao.select(query);
		
			try {
				while(resultSet.next())
				{
					StudentEducationalInformation product = new StudentEducationalInformation();
					product.getInformation().setName(resultSet.getString(1));
					product.setM_id(resultSet.getInt(2));
					product.setStandard(resultSet.getInt(3));
					product.setMarks(resultSet.getInt(4));
					list.add(product);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return list;
		
	}	
		
}

	
	
	
	
	


