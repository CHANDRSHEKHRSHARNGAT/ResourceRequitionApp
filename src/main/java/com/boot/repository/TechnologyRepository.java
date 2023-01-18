package com.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.ResourseType;
import com.boot.entity.Technology;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {
	

	public Technology findByTechnologyName(String technologyName);
	public List<Technology> findByResourceType1 (ResourseType resourceType);

}
