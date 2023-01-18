package com.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.CityEntity;
import com.boot.entity.StateEntity;



public interface CityRepository  extends JpaRepository<CityEntity, Integer>  {

	public List<CityEntity> findByState1(StateEntity state);
	
}
