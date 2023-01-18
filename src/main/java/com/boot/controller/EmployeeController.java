package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.entity.EmployeeEntity;
import com.boot.service.EmployeeService;

@Controller
@RequestMapping("/Employee")
@CrossOrigin("*")
public class EmployeeController {
	@Autowired
	public EmployeeService es;
	
	@PostMapping("/login/{employeeEmail}&{employeePassword}")
	public ResponseEntity<EmployeeEntity> adminLogin(@PathVariable String employeeEmail,@PathVariable String employeePassword){
		EmployeeEntity res=this.es.employeeLogin(employeeEmail, employeePassword);
		if(res!=null) {		
			return new ResponseEntity<EmployeeEntity>(res,HttpStatus.OK);
		}
		else
			return null;
	}
	
	@PostMapping("/")
	public ResponseEntity<EmployeeEntity> addNewEmployee(@RequestBody EmployeeEntity employee)
	{
		return new ResponseEntity<EmployeeEntity>(this.es.addNewEmployee(employee),HttpStatus.CREATED);
	}
	
	@GetMapping("/{employeeId}")
	public ResponseEntity<EmployeeEntity> findEmployeeById(@PathVariable int employeeId)
	{
		return new ResponseEntity<EmployeeEntity>(this.es.findEmployeeById(employeeId),HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<EmployeeEntity>> findAllEmployees()
	{
		return new ResponseEntity<List<EmployeeEntity>>(this.es.findAllEmployees(),HttpStatus.OK);
	}
	
	
	

}
