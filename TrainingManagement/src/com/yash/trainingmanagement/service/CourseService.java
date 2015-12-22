package com.yash.trainingmanagement.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


import com.yash.trainingmanagement.domain.Course;
import com.yash.trainingmanagement.domain.Heading;
import com.yash.trainingmanagement.domain.SubHeading;
import com.yash.trainingmanagement.util.ConnectionProvider;


@Stateless
@LocalBean
public class CourseService implements CourseServiceLocal {

	
    public CourseService() {
       
    }

	@Override
	public void saveCourse(Course course,int userId) {
		String query="Insert into courses(course_title,description,reference_code,course_status,user_id)"
				+ " values('"+course.getCourse_title()+"','"+course.getDescription()+"','"+course.getReference_code()+"',"+course.isCourse_status()+","+userId+")";
		System.out.println(query);
		ConnectionProvider.update(query);
	}
	List<Course> list=new ArrayList<>();
	@Override
	public List<Course> displayCourse(int userId) {
		
		String query= "select * from courses where user_id="+userId;
		System.out.println(query);
		ResultSet resultSet=ConnectionProvider.select(query);
		try {
			while(resultSet.next())
			{
				Course course=new Course();
				course.setCourse_title(resultSet.getString("course_title"));
				course.setReference_code(resultSet.getString("reference_code"));
				course.setCourse_status(resultSet.getBoolean("course_status"));
			
				if (resultSet.getBoolean("course_status")){
					System.out.println("this is true");
					course.setCourse_status_str("Deactivate");
				}
				else{
						System.out.println("this is false");
					course.setCourse_status_str("Activate");
				}
				list.add(course);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void changeCourseStatus(int status, String course_status_rev) {
		String query="update courses set course_status=" + status +" where course_title ='"+course_status_rev+"'"; 
		System.out.println(query);
		ConnectionProvider.update(query);
	}

	@Override
	public int getCourse_Id(String course_status_rev) {
		int id=0;
		String query="select course_status from courses where course_title='"+course_status_rev+"'";
		System.out.println(query);
		ResultSet resultSet=ConnectionProvider.select(query);
		try {
			while(resultSet.next())
			{
				if(resultSet.getInt(1) == 1){
					
				}
				else {
					id =1 ;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public void deleteCourse(String course_status_rev) {
		String query="delete from courses where course_title='"+course_status_rev+"'";
		ConnectionProvider.update(query);
	}

	@Override
	public Course ViewCourse(String course_status_rev) {
		System.out.println("hii from ViewCouse in CourseService");
		List<Heading> headings;
		List<SubHeading>subHeadings;
		Course course = new Course();
		System.out.println("this is my course_status_rev"+course_status_rev);
		String query="select * from courses where course_title='"+course_status_rev+"'";
		System.out.println(query);
		ResultSet resultSet= ConnectionProvider.select(query);
			try {
				while(resultSet.next()){
				headings= new ArrayList<>(); 
				course.setCourse_title(resultSet.getString("course_title"));
				
				String query1= "select * from heading where course_id="+resultSet.getString("course_id");
				System.out.println(query1);
				ResultSet resultSet1= ConnectionProvider.select(query1);
				while(resultSet1.next()){
					Heading heading = new Heading();
					subHeadings= new ArrayList<>();
					heading.setHeading_text(resultSet1.getString("heading_text"));
					headings.add(heading);
					
					String query2= "select * from subheading where heading_id="+resultSet1.getString("heading_id");
					System.out.println(query2);
					ResultSet resultSet2= ConnectionProvider.select(query2);
					while(resultSet2.next()){
						SubHeading subheading= new SubHeading();
						subheading.setSubheading_text(resultSet2.getString("subheading_text"));
						subheading.setStatus(resultSet2.getString("status"));
						subheading.setSubheading_id(resultSet2.getInt("subheading_id"));
						subHeadings.add(subheading);
					}
					heading.setViewSubheadingList(subHeadings);
				}
				course.setViewHeadingList(headings);
				}
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
		return course;
	}

	@Override
	public List<Course> fetchTotalActiveCourses() {
		 String sql = "SELECT * FROM COURSES WHERE COURSE_STATUS=1";
	        List<Course> list = new ArrayList<>();
	        ResultSet resultSet = ConnectionProvider.select(sql);
	        try {
	            while(resultSet.next()){
	                Course course = new Course();
	                course.setCourse_title(resultSet.getString("COURSE_TITLE"));
	                course.setDescription(resultSet.getString("DESCRIPTION"));
	                course.setReference_code(resultSet.getString("REFERENCE_CODE"));
	                list.add(course);
	            }
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return list;
	}


}
