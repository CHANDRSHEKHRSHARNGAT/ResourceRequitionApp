package com.boot.service;

import java.util.List;

import com.boot.entity.ResourseType;

public interface ResourceTypeService {

	public ResourseType addNewResourceType(ResourseType newResourceTpe);
	public List<ResourseType> getAllResourseTypes();
}
