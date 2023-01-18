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

import com.boot.entity.StateEntity;
import com.boot.service.StateService;

@Controller
@RequestMapping("/State")
@CrossOrigin("*")
public class StateController {
	@Autowired
	public StateService ss;
	
	@PostMapping("/")
	public ResponseEntity<StateEntity>  addNewState(@RequestBody StateEntity state) {
		return new  ResponseEntity<StateEntity> (this.ss.addNewState(state),HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<StateEntity>> getAllStates(){
		return new  ResponseEntity<List<StateEntity>> (this.ss.getAllStates(),HttpStatus.OK);
		
	}
	
	@GetMapping("/{country}")
	public ResponseEntity<List<StateEntity>> getAllStatesOfCountry(@PathVariable String country ){
		return new  ResponseEntity<List<StateEntity>> (this.ss.getAllStatesOfCountry(country),HttpStatus.OK);
		
	}

}
