package com.yash.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.yash.dao.EmployeeDao;
import com.yash.domain.Employee;
import com.yash.service.EmployeServiceLocal;

@ManagedBean
@SessionScoped
public class EmployeeBean {
	public int id;
	public String name;
	public String contact;
	
	@Inject
	Employee employee;
	
	@Inject
	EmployeServiceLocal service;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String add(){
		Employee employee=new Employee();
		employee.setName(name);
		employee.setContact(contact);
		service.addEmployee(employee);
		return null;
	}
	
	public String delete(){
		return "";
	}
	
	public String update(){
		return "";
	}
	
	public String display(){
		return "";
	}
	
}
