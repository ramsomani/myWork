package com.yash.trainingmanagement.service;

import java.util.List;

import javax.ejb.Local;


import com.yash.trainingmanagement.domain.Course;


@Local
public interface CourseServiceLocal {
	public void saveCourse(Course course,int userId);

	public List<Course> displayCourse(int userId);

	public void changeCourseStatus(int status, String course_status_rev);

	public int getCourse_Id(String course_status_rev);

	public void deleteCourse(String course_status_rev);

	public Course ViewCourse(String course_status_rev);

	public List<Course> fetchTotalActiveCourses();
}
