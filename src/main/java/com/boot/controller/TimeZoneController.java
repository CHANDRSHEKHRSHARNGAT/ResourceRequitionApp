package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.entity.TimeZone;
import com.boot.service.TimeZoneService;

@Controller
@RequestMapping("/TimeZone")
@CrossOrigin("*")
public class TimeZoneController {
	@Autowired
	TimeZoneService tzs;
	
	@PostMapping("/")
	public ResponseEntity<TimeZone> addNewTimeZone(@RequestBody TimeZone tz) {
		return new ResponseEntity<TimeZone>(this.tzs.addNewTimeZone(tz),HttpStatus.CREATED);
	}
	@GetMapping("/")
	public ResponseEntity<List<TimeZone>> getAlltzs() {
		return new ResponseEntity<List< TimeZone>>(this.tzs.getAllTimeZones(),HttpStatus.OK);
	}

}
