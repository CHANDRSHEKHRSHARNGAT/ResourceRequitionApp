package com.boot.service;

import java.util.List;
import java.util.Set;

import com.boot.entity.TechnologySpecialization;

public interface TechnologySpecializationService {
	public TechnologySpecialization addNewTechSpecilaization(TechnologySpecialization newTS);
	public List<TechnologySpecialization> getAllTechSpecializations();
	public List<TechnologySpecialization> getAllTechSpecializationsByTechnologyName(String technologyName);

	public List<TechnologySpecialization> getAllTechSpecializationsByTechnologyNames(List<Integer> ids );
	

}
