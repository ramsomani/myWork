package com.yash.trainingmanagement.domain;

import java.util.ArrayList;
import java.util.List;

public class Heading {
	private String course_id;
	private String heading_text;
	private List<SubHeading> viewSubheadingList= new ArrayList<>();
	
	
	public List<SubHeading> getViewSubheadingList() {
		return viewSubheadingList;
	}

	public void setViewSubheadingList(List<SubHeading> viewSubheadingList) {
		this.viewSubheadingList = viewSubheadingList;
	}

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
	
}
