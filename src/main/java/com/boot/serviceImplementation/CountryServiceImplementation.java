package com.boot.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.CountryEntity;
import com.boot.repository.CountryRepository;
import com.boot.service.CountryService;

@Service
public class CountryServiceImplementation implements CountryService {
	
	@Autowired
	public CountryRepository cr;

	@Override
	public CountryEntity addNewCountryEntity(CountryEntity newCountry) {
		return this.cr.save(newCountry);
	}

	@Override
	public CountryEntity getCountryEntityById(int countryId) {
		return this.cr.findById(countryId).get();
	}

	@Override
	public List<CountryEntity> getAllCountries() {
		
		return this.cr.findAll();
	}

}
