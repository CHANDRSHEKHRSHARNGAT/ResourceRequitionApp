package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.entity.ResourceRequesitEntity;
import com.boot.service.RRService;

@Controller
@RequestMapping("/ResourceRequesit")
@CrossOrigin("*")
public class RRController {
	@Autowired
	public RRService rs;
	
	@PostMapping("/")
	public ResponseEntity<ResourceRequesitEntity> addNewTempRR(@RequestBody ResourceRequesitEntity rr) {
		return new ResponseEntity<ResourceRequesitEntity>(this.rs.addNewResourseRequesitEntity(rr),HttpStatus.CREATED);
	}

}
