package com.boot.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.StateEntity;
import com.boot.repository.CountryRepository;
import com.boot.repository.StateRepository;
import com.boot.service.StateService;

@Service
public class StateServiceImplementation implements StateService{

	@Autowired
	public StateRepository sr;
	
	@Autowired
	public CountryRepository cr;
	
	@Override
	public StateEntity addNewState(StateEntity state) {
		
		return this.sr.save(state);
	}

	@Override
	public List<StateEntity> getAllStates() {
		return this.sr.findAll();
	}

	@Override
	public List<StateEntity> getAllStatesOfCountry(String countryName) {

		if(this.cr.findByCountryName(countryName)!=null) {
		return this.sr.findByCountry1(this.cr.findByCountryName(countryName));}
		
		return null;
	}

}
