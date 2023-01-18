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
import org.springframework.web.bind.annotation.RestController;

import com.boot.entity.ResourseType;
import com.boot.service.ResourceTypeService;

@Controller
@RequestMapping("/ResourceType")
@CrossOrigin("*")
public class ResourceTypeController {
	@Autowired
	public ResourceTypeService rts;
	
	@PostMapping("/")
	public ResponseEntity<ResourseType> addNewResourceType(@RequestBody ResourseType resType) {
		return new ResponseEntity<ResourseType>( this.rts.addNewResourceType(resType), HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<ResourseType>> getAllResourceType() {
		return new ResponseEntity<List<ResourseType>>( this.rts.getAllResourseTypes(), HttpStatus.OK);
	}

}
