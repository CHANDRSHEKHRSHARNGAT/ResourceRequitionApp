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

import com.boot.entity.Qly_Degree;
import com.boot.service.Qly_DegreeService;

@RestController
@RequestMapping("/Qly_Degree")
@CrossOrigin("*")
public class Qly_DegreeController {

	
	@Autowired
	public Qly_DegreeService ds;
	
	@PostMapping("/")
	public  ResponseEntity<Qly_Degree> addNewQualificationEntity( @RequestBody Qly_Degree newDegree) {
		 return new ResponseEntity<Qly_Degree>(this.ds.addNewQly_Degree(newDegree),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/")
	public  ResponseEntity<List<Qly_Degree>> getAllQualificationEntity() {
		
		 return new ResponseEntity<List<Qly_Degree>>(this.ds.getAllDegrees(),HttpStatus.OK);
		
	}
	
	@GetMapping("/qualification/{qualificationName}")
	public  ResponseEntity<List<Qly_Degree>> getAllQualificationEntityByQualificationId(@PathVariable String qualificationName) {
		
		 return new ResponseEntity<List<Qly_Degree>>(this.ds.getAllDegreesByQualificationName(qualificationName),HttpStatus.OK);
		
	}
	
	@PostMapping("/edit/{degreeId}")
	public  ResponseEntity<Qly_Degree> editQualificationEntity( @PathVariable int degreeId,@RequestBody Qly_Degree degree) {
		
		 return new ResponseEntity<Qly_Degree>(this.ds.editQly_DegreeById(degreeId ,degree),HttpStatus.CREATED);
		
	}
	@GetMapping("/{degreeId}")
	public  ResponseEntity<Qly_Degree> getQualificationEntityByID(@PathVariable int degreeId) {
		 return new ResponseEntity<Qly_Degree>(this.ds.getQly_DegreeById(degreeId),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{degreeId}")
	public  ResponseEntity<Boolean> deleteQualificationEntityByID( @PathVariable int degreeId) {
		
		boolean res=this.ds.deleteQly_DegreeById(degreeId);
		 return new ResponseEntity<Boolean>(res,HttpStatus.OK);
		
	}
	
	
}
