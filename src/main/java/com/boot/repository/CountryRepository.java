package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.CountryEntity;



public interface CountryRepository extends JpaRepository<CountryEntity, Integer> {
	public CountryEntity findByCountryName(String countryName);

}
