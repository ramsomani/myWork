package com.yash.trainingmanagement.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.yash.trainingmanagement.domain.Heading;
import com.yash.trainingmanagement.util.ConnectionProvider;


@Stateless
@LocalBean
public class HeadingService implements HeadingServiceLocal {

   
    public HeadingService() {
        
    }

	@Override
	public List<String> getCourseList() {
		
		List<String> list=new ArrayList<>();
		String query="Select course_title from courses";
		ResultSet resultSet=ConnectionProvider.select(query);
		try {
			while (resultSet.next()) {
				System.out.println(resultSet.getString("course_title"));
				list.add(resultSet.getString("course_title"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void addHeading(Heading heading) {
		String courseName=heading.getCourse_id();
		int courseId=getCourseId(courseName);
		System.out.println(courseId);
		String query="insert into heading(heading_text,course_id) values('"+heading.getHeading_text()+"',"+courseId+")";
		System.out.println(query);
		ConnectionProvider.update(query);
	}
	
	public int getCourseId(String courseName){
		int id=0;
		String query="select course_id from courses where course_title = '"+courseName+"'";
		ResultSet resultSet=ConnectionProvider.select(query);
			try {
				while(resultSet.next())
				{
					id=resultSet.getInt("course_id");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return id;
	}

}
