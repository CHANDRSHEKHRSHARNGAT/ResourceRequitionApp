package com.boot.service;

import java.util.List;

import com.boot.entity.CityEntity;

public interface CityService {
	 public CityEntity addNewCity(CityEntity addNewCity);
	 
	 public List<CityEntity> getAllCities();
	 public List<CityEntity> gettAllCitiesOfState(String stateName);
	 

}

