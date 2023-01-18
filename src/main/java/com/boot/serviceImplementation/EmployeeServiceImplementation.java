package com.boot.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.EmployeeEntity;
import com.boot.repository.EmployeeRepository;
import com.boot.service.EmployeeService;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	public EmployeeRepository er;

	@Override
	public EmployeeEntity employeeLogin(String employeeEmail, String employeePassword) {
		return this.er.findByEmployeeEmailAndEmployeePassword(employeeEmail, employeePassword);
	}

	@Override
	public EmployeeEntity findEmployeeById(int empId) {
		if(this.er.existsById(empId)) {
		return this.er.findById(empId).get();
		}
		return null;
	}

	@Override
	public List<EmployeeEntity> findAllEmployees() {
		
		return this.er.findAll();
	}

	@Override
	public EmployeeEntity addNewEmployee(EmployeeEntity employee) {
		
		return this.er.save(employee);
	}

}
