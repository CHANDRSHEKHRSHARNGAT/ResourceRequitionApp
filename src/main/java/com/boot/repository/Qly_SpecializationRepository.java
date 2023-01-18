package com.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.Qly_Degree;
import com.boot.entity.Qly_Specialization;

public interface Qly_SpecializationRepository extends JpaRepository<Qly_Specialization, Integer> {
	
	public List<Qly_Specialization> findByDegree1(Qly_Degree degree);

}
