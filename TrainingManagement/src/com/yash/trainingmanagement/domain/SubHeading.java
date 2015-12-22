package com.yash.trainingmanagement.domain;

public class SubHeading {
	private String subheading_text;
	private String heading_id;
	private String status;
	private int subheading_id;
	

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

	public String getHeading_id() {
		return heading_id;
	}

	public void setHeading_id(String heading_id) {
		this.heading_id = heading_id;
	}

	

	public String getSubheading_text() {
		return subheading_text;
	}

	public void setSubheading_text(String subheading_text) {
		this.subheading_text = subheading_text;
	}
	
}
