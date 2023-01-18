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

import com.boot.entity.QualificationEntity;
import com.boot.service.QualificationEntityService;

@RestController
@RequestMapping("/Qualification")
@CrossOrigin("*")
public class QualificationController {
	
	@Autowired
	public QualificationEntityService qs;
	
	@PostMapping("/")
	public  ResponseEntity<QualificationEntity> addNewQualificationEntity( @RequestBody QualificationEntity qualification) {
		
		 return new ResponseEntity<QualificationEntity>(this.qs.addNewQualificationEntity(qualification),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/")
	public  ResponseEntity<List<QualificationEntity>> getAllQualificationEntity() {
		
		 return new ResponseEntity<List<QualificationEntity>>(this.qs.getAllQualifications(),HttpStatus.OK);
		
	}
	
	@PostMapping("/edit/{qualificationId}")
	public  ResponseEntity<QualificationEntity> editQualificationEntity( @PathVariable int qualificationId,@RequestBody QualificationEntity qualification) {
		
		 return new ResponseEntity<QualificationEntity>(this.qs.editQualificationEntityById(qualificationId ,qualification),HttpStatus.CREATED);
		
	}
	@GetMapping("/{qualificationId}")
	public  ResponseEntity<QualificationEntity> getQualificationEntityByID(@PathVariable int qualificationId) {
	System.out.println(qualificationId);
		 return new ResponseEntity<QualificationEntity>(this.qs.getQualificationEntityById(qualificationId),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{qualificationId}")
	public  ResponseEntity<Boolean> deleteQualificationEntityByID( @PathVariable int qualificationId) {
		
		boolean res=this.qs.deleteQualificationEntityById(qualificationId);
		 return new ResponseEntity<Boolean>(res,HttpStatus.OK);
		
	}
	

}
