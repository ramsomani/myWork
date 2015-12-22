package com.yash.trainingmanagement.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.yash.trainingmanagement.domain.Heading;

import com.yash.trainingmanagement.service.HeadingServiceLocal;

@ManagedBean
@SessionScoped
public class HeadingBean {
	private String course_id;
	private String heading_text;
	List<String> headingList=new ArrayList<>();
	@EJB
	HeadingServiceLocal headingServiceLocal;
	
	
	
	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getHeading_text() {
		return heading_text;	
	}

	public void setHeading_text(String heading_text) {
		this.heading_text = heading_text;
	}
	
	
	public List<String> getHeadingList() {
		return headingList;
	}

	public void setHeadingList(List<String> headingList) {
		this.headingList = headingList;
	}

	@PostConstruct
	public void init()
	{
		headingList=headingServiceLocal.getCourseList();	
	}
	@Inject
	Heading heading;
	public String saveHeading(){
		heading.setCourse_id(course_id);
		heading.setHeading_text(heading_text);
		headingServiceLocal.addHeading(heading);
		return "addCourseFacelet";
	}
	
	public String saveAndAddHeading(){
		heading.setCourse_id(course_id);
		heading.setHeading_text(heading_text);
		headingServiceLocal.addHeading(heading);
		return null;
	}
}
