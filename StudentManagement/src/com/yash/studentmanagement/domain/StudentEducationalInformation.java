package com.yash.studentmanagement.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentEducationalInformation {
	int m_id;
	int standard;
	int marks;
	StudentPersonalInformation information=new StudentPersonalInformation();
	
	public StudentPersonalInformation getInformation() {
		return information;
	}
	public void setInformation(StudentPersonalInformation information) {
		this.information = information;
	}
	public StudentEducationalInformation()
	{
		
	}
	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	
}
