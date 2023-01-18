package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.entity.TempResourseRequesitEntity;
import com.boot.service.TempRRService;

@Controller
@RequestMapping("/Temp")
@CrossOrigin("*")
public class TempRRController {
	@Autowired
	public TempRRService trs;
	
	@PostMapping("/")
	public ResponseEntity<TempResourseRequesitEntity> addNewTempRR(@RequestBody TempResourseRequesitEntity trr) {
		return new ResponseEntity<TempResourseRequesitEntity>(this.trs.addNewResourseRequesitEntity(trr),HttpStatus.CREATED);
	}
	
	

}
