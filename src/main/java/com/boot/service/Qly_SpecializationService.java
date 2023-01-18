package com.boot.service;

import java.util.List;

import com.boot.entity.Qly_Specialization;


public interface Qly_SpecializationService {
	public Qly_Specialization addNewQly_Specialization(Qly_Specialization qly_specialization);
	public Qly_Specialization editQly_SpecializationById(int specializationId,Qly_Specialization specialaization);
	public boolean deleteQly_SpecializationById(int specializationId);
	public Qly_Specialization getQly_SpecializationById(int specializationId);
	
	public List<Qly_Specialization> getAllSpecializations();
	public List<Qly_Specialization> getAllSpecializationsByDegreeName(String degreeName );


}
