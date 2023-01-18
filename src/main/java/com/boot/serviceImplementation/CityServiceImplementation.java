package com.boot.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.CityEntity;
import com.boot.repository.CityRepository;
import com.boot.repository.StateRepository;
import com.boot.service.CityService;

@Service
public class CityServiceImplementation implements CityService {
	
	@Autowired
	public CityRepository cir;
	
	@Autowired 
	public StateRepository sr;
	
	

	@Override
	public CityEntity addNewCity(CityEntity newCity) {
		
		return this.cir.save(newCity);
	}

	@Override
	public List<CityEntity> getAllCities() {
		return this.cir.findAll();
	}

	@Override
	public List<CityEntity> gettAllCitiesOfState(String stateName) {
		if(this.sr.findByStateName(stateName)!=null) {
		return this.cir.findByState1(this.sr.findByStateName(stateName));
		}
		return new ArrayList<CityEntity>();
	}
	

}
