package com.boot.service;

import java.util.List;

import com.boot.entity.Qly_Degree;

public interface Qly_DegreeService {
	
	public Qly_Degree addNewQly_Degree(Qly_Degree qly_degree);
	public Qly_Degree editQly_DegreeById(int qly_degreeId,Qly_Degree qly_degree);
	public boolean deleteQly_DegreeById(int qly_degreeId);
	public Qly_Degree getQly_DegreeById(int qly_degreeId);
	
	public List<Qly_Degree> getAllDegrees();
	public List<Qly_Degree> getAllDegreesByQualificationName(String qualificationName );

}
