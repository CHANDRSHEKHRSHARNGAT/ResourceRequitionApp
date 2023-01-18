package com.boot.controller;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
import com.boot.entity.TechnologySpecialization;
import com.boot.service.TechnologySpecializationService;



@Controller
@RequestMapping("/TechnologySpecialization")
@CrossOrigin("*")
public class TechnologySpecializationController {
	
	@Autowired
	public TechnologySpecializationService tss;
	
	
	@PostMapping("/")
	public ResponseEntity<TechnologySpecialization> addNewTechnologySpecialization(@RequestBody TechnologySpecialization newtechspecialization) {
		
		return new ResponseEntity<TechnologySpecialization>(this.tss.addNewTechSpecilaization(newtechspecialization),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<TechnologySpecialization>> getAllTechnologiespecializations(){
		return new ResponseEntity<List<TechnologySpecialization>>(this.tss.getAllTechSpecializations(),HttpStatus.OK);
	}
	
	@GetMapping("/{TechnologyName}")
	public ResponseEntity<List<TechnologySpecialization>> getAllTechnologiespecializationsByTechnologyName(@PathVariable String TechnologyName){

		return new ResponseEntity<List<TechnologySpecialization>>(this.tss.getAllTechSpecializationsByTechnologyName(TechnologyName),HttpStatus.OK);
	}
	
	@PostMapping("/byTechnologies")
	public ResponseEntity<List<TechnologySpecialization>> getAllTechnologiespecializationsByTechnologyIds(@RequestBody List<Technology> ids){
        
//		List<Integer> spezIds = new ArrayList<Integer>();
		 List<Integer> spezIds = ids.stream().map(obj -> obj.getTechnologyId()).
			        collect(Collectors.toList());
		
		return new ResponseEntity<List<TechnologySpecialization>>(this.tss.getAllTechSpecializationsByTechnologyNames(spezIds),HttpStatus.OK);
	}
	


}
