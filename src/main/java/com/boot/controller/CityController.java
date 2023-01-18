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

import com.boot.entity.CityEntity;
import com.boot.service.CityService;

@Controller
@RequestMapping("/City")
@CrossOrigin("*")
public class CityController {
	
	@Autowired
	public CityService cs;
	
	@PostMapping("/")
	public ResponseEntity<CityEntity>  addNewState(@RequestBody CityEntity city) {
		return new  ResponseEntity<CityEntity> (this.cs.addNewCity(city),HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<CityEntity>> getAllCities(){
		return new  ResponseEntity<List<CityEntity>> (this.cs.getAllCities(),HttpStatus.OK);
		
	}
	
	@GetMapping("/{state}")
	public ResponseEntity<List<CityEntity>> getAllCitiesOfState(@PathVariable String state ){
		return new  ResponseEntity<List<CityEntity>> (this.cs.gettAllCitiesOfState(state),HttpStatus.OK);
		
	}

}
