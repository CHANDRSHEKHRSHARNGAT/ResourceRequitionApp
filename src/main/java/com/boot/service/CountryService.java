package com.boot.service;

import java.util.List;

import com.boot.entity.CountryEntity;

public interface CountryService {
	
	public CountryEntity addNewCountryEntity(CountryEntity newCountry);
	public CountryEntity getCountryEntityById(int countryId);
	public List<CountryEntity>  getAllCountries();
	
	
}
