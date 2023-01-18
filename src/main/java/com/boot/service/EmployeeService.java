package com.boot.service;

import java.util.List;

import com.boot.entity.EmployeeEntity;

public interface EmployeeService {

	public EmployeeEntity employeeLogin(String employeeEmail,String employeePassword);
	public EmployeeEntity addNewEmployee(EmployeeEntity employee);
	public EmployeeEntity findEmployeeById(int empId);
	public List<EmployeeEntity> findAllEmployees();
	
	
}
