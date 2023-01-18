package com.boot.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.Qly_Specialization;
import com.boot.repository.Qly_DegreeRepository;
import com.boot.repository.Qly_SpecializationRepository;
import com.boot.service.Qly_SpecializationService;

@Service
public class Qly_specializationServiceImplementation implements Qly_SpecializationService{
	
	@Autowired
	public Qly_SpecializationRepository qr;
	
	@Autowired
	public Qly_DegreeRepository dr;

	@Override
	public Qly_Specialization addNewQly_Specialization(Qly_Specialization qly_specialization) {
	
		return this.qr.save(qly_specialization);
	}

	@Override
	public Qly_Specialization editQly_SpecializationById(int specializationId, Qly_Specialization specialaization) {
	
		
		if(this.qr.existsById(specializationId)) {
			return this.qr.save(specialaization);
		}
		
		
		return null;
	}

	@Override
	public boolean deleteQly_SpecializationById(int specializationId) {
		if(this.qr.existsById(specializationId)) {
			this.qr.deleteById(specializationId);
			return true;
		}
		return false;
	}

	@Override
	public Qly_Specialization getQly_SpecializationById(int specializationId) {
		
		if(this.qr.existsById(specializationId)) {

			return this.qr.findById(specializationId).get();
		}
		return null;
	}

	@Override
	public List<Qly_Specialization> getAllSpecializations() {
		
		return this.qr.findAll();
	}

	@Override
	public List<Qly_Specialization> getAllSpecializationsByDegreeName(String degreeName) {
	
		if(this.dr.findByDegreeName(degreeName)!=null) {

			return this.qr.findByDegree1(this.dr.findByDegreeName(degreeName));
			
		}
		return null;
	}

}
