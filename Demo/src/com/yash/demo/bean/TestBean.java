package com.yash.demo.bean;

import javax.faces.bean.ManagedBean;
import javax.servlet.http.Part;

@ManagedBean
public class TestBean {

	private Part file;

	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		this.file = file;
	}
	
	public void upLoad(){
		System.out.println(file);
	}
}
