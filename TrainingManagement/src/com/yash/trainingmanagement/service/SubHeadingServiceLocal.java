package com.yash.trainingmanagement.service;

import java.util.List;

import javax.ejb.Local;

import com.yash.trainingmanagement.domain.SubHeading;

@Local
public interface SubHeadingServiceLocal {

	List<String> getCourseList();

	public void addSubHeading(SubHeading subHeading);

	void updateStatus(String status, int subheading_id);

}
