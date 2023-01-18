package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.ResourseType;

public interface ResourseTypeRepository extends JpaRepository<ResourseType, Integer>{
	public ResourseType findByResourceTypeName(String resourceTypeName);

}
