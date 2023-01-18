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

import com.boot.entity.Technology;
import com.boot.service.TechnologyService;

@Controller
@RequestMapping("/Technology")
@CrossOrigin("*")
public class TechnologyController {
	
	@Autowired
	public TechnologyService ts;
	
	
	@PostMapping("/")
	public ResponseEntity<Technology> addNewTechnology(@RequestBody Technology newtech) {
		
		return new ResponseEntity<Technology>(this.ts.addNewTechnology(newtech),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Technology>> getAllTechnologies(){
		return new ResponseEntity<List<Technology>>(this.ts.getAllTechnologies(),HttpStatus.OK);
	}
	
	@GetMapping("/{resourceTypeName}")
	public ResponseEntity<List<Technology>> getAllTechnologiesByResourceTypeName(@PathVariable String resourceTypeName){

		return new ResponseEntity<List<Technology>>(this.ts.getAllTechnologiesByResourceTypeName(resourceTypeName),HttpStatus.OK);
	}
	

}
