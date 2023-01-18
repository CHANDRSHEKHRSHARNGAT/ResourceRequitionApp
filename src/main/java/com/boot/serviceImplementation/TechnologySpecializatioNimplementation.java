package com.boot.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.TechnologySpecialization;
import com.boot.repository.TechnologyRepository;
import com.boot.repository.TechnologySpecialaizationRepository;
import com.boot.service.TechnologySpecializationService;

@Service
public class TechnologySpecializatioNimplementation  implements TechnologySpecializationService{
	
	@Autowired
	public TechnologyRepository tr;
	
	@Autowired
	public TechnologySpecialaizationRepository tsr;
	

	@Override
	public TechnologySpecialization addNewTechSpecilaization(TechnologySpecialization newTS) {
		
		return this.tsr.save(newTS);
	}

	@Override
	public List<TechnologySpecialization> getAllTechSpecializations() {
		
		return this.tsr.findAll();
	}

	@Override
	public List<TechnologySpecialization> getAllTechSpecializationsByTechnologyName(String technologyName) {
		
		if(this.tr.findByTechnologyName(technologyName)!=null) {
			return this.tsr.findByTech1(this.tr.findByTechnologyName(technologyName));
		}
		
		return null;
	}

	@Override
	public List<TechnologySpecialization> getAllTechSpecializationsByTechnologyNames(List<Integer> ids) {
		
		return this.tsr.selectSpecializations(ids);
	}

}
