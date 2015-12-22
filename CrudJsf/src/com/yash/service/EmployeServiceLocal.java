package com.yash.service;

import javax.ejb.Local;

import com.yash.domain.Employee;

@Local
public interface EmployeServiceLocal {

	void addEmployee(Employee employee);

}
