package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entity.Qly_Specialization;
import com.boot.service.Qly_SpecializationService;

@RestController
@RequestMapping("/Qly_Specialization")
@CrossOrigin("*")
public class Qly_SpecializationController {


	@Autowired
	public Qly_SpecializationService ss ;
	
	@PostMapping("/")
	public  ResponseEntity<Qly_Specialization> addNewSpecialization( @RequestBody Qly_Specialization specialization) {
		 return new ResponseEntity<Qly_Specialization>(this.ss.addNewQly_Specialization(specialization),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/")
	public  ResponseEntity<List<Qly_Specialization>> getAllSpecializations() {
		
		 return new ResponseEntity<List<Qly_Specialization>>(this.ss.getAllSpecializations(),HttpStatus.OK);
		
	}
	
	@GetMapping("/degree/{degreeName}")
	public  ResponseEntity<List<Qly_Specialization>> getAllSpecializationsByDegreeId(@PathVariable String degreeName) {
		
		 return new ResponseEntity<List<Qly_Specialization>>(this.ss.getAllSpecializationsByDegreeName(degreeName),HttpStatus.OK);
		
	}
	
	@PostMapping("/edit/{specialaizationId}")
	public  ResponseEntity<Qly_Specialization> editQualificationEntity( @PathVariable int specialaizationId,@RequestBody Qly_Specialization specialization) {
		
		 return new ResponseEntity<Qly_Specialization>(this.ss.editQly_SpecializationById(specialaizationId ,specialization),HttpStatus.CREATED);
		
	}
	@GetMapping("/{specialaizationId}")
	public  ResponseEntity<Qly_Specialization> getQualificationEntityByID(@PathVariable int specialaizationId) {
		 return new ResponseEntity<Qly_Specialization>(this.ss.getQly_SpecializationById(specialaizationId),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{specialaizationId}")
	public  ResponseEntity<Boolean> deleteQualificationEntityByID( @PathVariable int specialaizationId) {
		
		boolean res=this.ss.deleteQly_SpecializationById(specialaizationId);
		 return new ResponseEntity<Boolean>(res,HttpStatus.OK);
		
	}

	
	
}
