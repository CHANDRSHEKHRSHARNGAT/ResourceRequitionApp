package com.boot.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.ResourseType;
import com.boot.repository.ResourseTypeRepository;
import com.boot.service.ResourceTypeService;

@Service
public class ResourceTypeServiceImplementation implements ResourceTypeService {
	@Autowired
	public ResourseTypeRepository rtr;

	@Override
	public ResourseType addNewResourceType(ResourseType newResourceTpe) {
		
		return this.rtr.save(newResourceTpe);
	}

	@Override
	public List<ResourseType> getAllResourseTypes() {
		return this.rtr.findAll();
	}
	

}
