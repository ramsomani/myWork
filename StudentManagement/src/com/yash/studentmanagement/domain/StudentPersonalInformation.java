package com.yash.studentmanagement.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentPersonalInformation {
	int s_id;
	String name;
	String city;
	public StudentPersonalInformation()
	{
		
	}
	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
