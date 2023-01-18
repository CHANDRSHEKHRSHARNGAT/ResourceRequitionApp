package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
	public EmployeeEntity findByEmployeeEmailAndEmployeePassword(String employeeEmail,String employeePassword);

}
