package com.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.CountryEntity;
import com.boot.entity.StateEntity;

public interface StateRepository extends JpaRepository<StateEntity, Integer> {
	
	public List<StateEntity> findByCountry1(CountryEntity country);
	public StateEntity findByStateName(String stateName);

}
