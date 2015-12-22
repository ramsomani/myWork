package com.yash.trainingmanagement.bean;

import java.util.ArrayList;
import java.util.List;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.yash.trainingmanagement.domain.SubHeading;
import com.yash.trainingmanagement.service.SubHeadingServiceLocal;

@ManagedBean
@SessionScoped
public class SubHeadingBean {
	private String subheading_text;
	private String heading_id;
	private String status;
	private int subheading_id;
	private int subheading_status_rev;  
	 
	List<String> subheadingList= new ArrayList<>();
	
	@EJB
	SubHeadingServiceLocal subHeadingServiceLocal;
	@Inject
	SubHeading subHeading;
	
	
	public int getSubheading_id() {
		return subheading_id;
	}
	public void setSubheading_id(int subheading_id) {
		this.subheading_id = subheading_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getSubheadingList() {
		return subheadingList;
	}
	public void setSubheadingList(List<String> subheadingList) {
		this.subheadingList = subheadingList;
	}
	public String getSubheading_text() {
		
		return subheading_text;
	}
	public void setSubheading_text(String subheading_text) {
		this.subheading_text = subheading_text;
	}
	public String getHeading_id() {
		subheadingList=subHeadingServiceLocal.getCourseList();
		return heading_id;
	}
	public void setHeading_id(String heading_id) {
		this.heading_id = heading_id;
		 
	}

	
	public int getSubheading_status_rev() {
		return subheading_status_rev;
	}
	public void setSubheading_status_rev(int subheading_status_rev) {
		this.subheading_status_rev = subheading_status_rev;
	}
	public String saveSubheading()
	{
		subHeading.setHeading_id(heading_id);
		subHeading.setSubheading_text(subheading_text);
		subHeading.setStatus(status);
		subHeadingServiceLocal.addSubHeading(subHeading);
		return "addCourseFacelet";
	}
	
	public String saveAndAddSubheading(){
		subHeading.setHeading_id(heading_id);
		subHeading.setSubheading_text(subheading_text);
		subHeading.setStatus(status);
		subHeadingServiceLocal.addSubHeading(subHeading);
		return null;
	}
	
	public String updateStatus(){
		System.out.println(subheading_status_rev);
		System.out.println(status);
		subHeadingServiceLocal.updateStatus(status,subheading_status_rev);
		return "";
	}
}
