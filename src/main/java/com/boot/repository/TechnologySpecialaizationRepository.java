package com.boot.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.boot.entity.Technology;
import com.boot.entity.TechnologySpecialization;

public interface TechnologySpecialaizationRepository extends JpaRepository<TechnologySpecialization, Integer> {
	public List<TechnologySpecialization> findByTech1(Technology technology);

//	@Query("SELECT * FROM technology_specialization  WHERE technology_id IN :ids")
//	public List<TechnologySpecialization> getTechnologies(@Param("ids") Set<Integer> ids);
	
	@Query(value="select * from technology_specialization where technology_id in (:ids)",nativeQuery =true)
	List<TechnologySpecialization> selectSpecializations(@Param("ids") List<Integer> ids);
}
