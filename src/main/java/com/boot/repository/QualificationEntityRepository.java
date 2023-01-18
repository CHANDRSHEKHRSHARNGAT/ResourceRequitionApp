package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.QualificationEntity;

public interface QualificationEntityRepository  extends JpaRepository<QualificationEntity, Integer>  {
	
	public QualificationEntity findByQualificationName(String qualificationName);

}
