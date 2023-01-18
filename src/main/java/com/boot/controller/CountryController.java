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

import com.boot.entity.CountryEntity;
import com.boot.service.CountryService;

@Controller
@RequestMapping("/Country")
@CrossOrigin("*")
public class CountryController {
	
	@Autowired
	public CountryService  cs;
	
	@PostMapping("/")
	public ResponseEntity<CountryEntity> addNewCountry(@RequestBody CountryEntity country) {
		
		return new ResponseEntity<CountryEntity>(this.cs.addNewCountryEntity(country),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<CountryEntity>> getAllCountries(){
		return new ResponseEntity<List<CountryEntity>>(this.cs.getAllCountries(),HttpStatus.OK);
	}

	

}
