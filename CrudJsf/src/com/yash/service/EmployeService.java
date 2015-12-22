package com.yash.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.yash.dao.EmployeeDao;
import com.yash.domain.Employee;

/**
 * Session Bean implementation class EmployeService
 */
@Stateless
@LocalBean
public class EmployeService implements EmployeServiceLocal {

	@Inject
	EmployeeDao employeeDao;

	@Override
	public void addEmployee(Employee employee) {
	employeeDao.addEmployee(employee);	
	}

}
