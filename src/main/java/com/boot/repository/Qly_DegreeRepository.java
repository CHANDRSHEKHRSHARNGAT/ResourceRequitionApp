package com.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.Qly_Degree;
import com.boot.entity.QualificationEntity;


public interface Qly_DegreeRepository extends JpaRepository<Qly_Degree, Integer> {
	
	public Qly_Degree findByDegreeName(String degreeName);
	public List<Qly_Degree> findByQualification1(QualificationEntity qualification);

}
