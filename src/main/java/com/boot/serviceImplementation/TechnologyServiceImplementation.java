package com.boot.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.Technology;
import com.boot.repository.ResourseTypeRepository;
import com.boot.repository.TechnologyRepository;
import com.boot.service.TechnologyService;

@Service
public class TechnologyServiceImplementation  implements TechnologyService{

	@Autowired
	public TechnologyRepository tr;
	
	@Autowired
	public ResourseTypeRepository rtr;
	
	@Override
	public Technology addNewTechnology(Technology newtech) {
		
		return this.tr.save(newtech);
	}

	@Override
	public List<Technology> getAllTechnologies() {
		
		return this.tr.findAll();
	}

	@Override
	public List<Technology> getAllTechnologiesByResourceTypeName(String resourceTypeName) {

		if(this.rtr.findByResourceTypeName(resourceTypeName)!=null) {
			return this.tr.findByResourceType1(this.rtr.findByResourceTypeName(resourceTypeName));
		}
		
		return null;
	}
	
	

}
