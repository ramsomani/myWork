package com.yash.trainingmanagement.service;

import java.util.List;

import javax.ejb.Local;

import com.yash.trainingmanagement.domain.Heading;

@Local
public interface HeadingServiceLocal {

	public List<String> getCourseList();
	public void addHeading(Heading heading);

}
