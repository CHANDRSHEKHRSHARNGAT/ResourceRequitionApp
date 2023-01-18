package com.boot.service;

import java.util.List;

import com.boot.entity.Technology;

public interface TechnologyService {

	public Technology addNewTechnology(Technology newtech);
	public List<Technology> getAllTechnologies();
	public List<Technology> getAllTechnologiesByResourceTypeName(String resourceTypeName);
}
