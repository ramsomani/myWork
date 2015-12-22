package com.yash.trainingmanagement.domain;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private String course_title;
	private String Description;
	private String reference_code;
	private boolean course_status;
	private String course_status_str;
	private String course_status_rev;
	
	private List<Heading> viewHeadingList= new ArrayList<>();
	
	
	
	public List<Heading> getViewHeadingList() {
		return viewHeadingList;
	}
	public void setViewHeadingList(List<Heading> viewHeadingList) {
		this.viewHeadingList = viewHeadingList;
	}
	public String getCourse_status_rev() {
		return course_status_rev;
	}
	public void setCourse_status_rev(String course_status_rev) {
		this.course_status_rev = course_status_rev;
	}
	public String getCourse_status_str() {
		return course_status_str;
	}
	public void setCourse_status_str(String course_status_str) {
		this.course_status_str = course_status_str;
	}
	public String getCourse_title() {
		return course_title;
	}
	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getReference_code() {
		return reference_code;
	}
	public void setReference_code(String reference_code) {
		this.reference_code = reference_code;
	}
	public boolean isCourse_status() {
		return course_status;
	}
	public void setCourse_status(boolean course_status) {
		this.course_status = course_status;
	}
	
		
}
