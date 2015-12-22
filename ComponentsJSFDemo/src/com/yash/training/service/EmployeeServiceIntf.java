package com.yash.training.service;

import java.util.List;

import javax.ejb.Local;

import com.yash.bean.Employee;
import com.yash.bean.EmployeeDB;

@Local
public interface EmployeeServiceIntf {
	
	public List<EmployeeDB> getAllEmployees() throws Exception;
	
	public void deleteEmployee(int empid) throws Exception;

}
