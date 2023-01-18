package com.boot.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.Qly_Degree;
import com.boot.repository.Qly_DegreeRepository;
import com.boot.repository.QualificationEntityRepository;
import com.boot.service.Qly_DegreeService;


@Service
public class Qly_DegreeServiceImplementation  implements Qly_DegreeService{

	
	@Autowired
	public Qly_DegreeRepository dr;
	
	@Autowired
	public QualificationEntityRepository qr;
	
	@Override
	public Qly_Degree addNewQly_Degree(Qly_Degree qly_degree) {
		
		return this.dr.save(qly_degree);
	}

	@Override
	public Qly_Degree editQly_DegreeById(int qly_degreeId, Qly_Degree qly_degree) {
		if(this.dr.existsById(qly_degreeId))
		{
			return this.dr.save(qly_degree);
		}
		return null;
	}

	@Override
	public boolean deleteQly_DegreeById(int qly_degreeId) {
		if(this.dr.existsById(qly_degreeId))
		{
			this.dr.deleteById(qly_degreeId);

			return true;
			}
		return false;
	}

	@Override
	public Qly_Degree getQly_DegreeById(int qly_degreeId) {
		if(this.dr.existsById(qly_degreeId))
		{
			return this.dr.findById(qly_degreeId).get();
			}
		return null;
	}

	@Override
	public List<Qly_Degree> getAllDegrees() {
		
		return this.dr.findAll();
	}

	@Override
	public List<Qly_Degree> getAllDegreesByQualificationName(String qualificationName) {
		if(this.qr.findByQualificationName(qualificationName)!=null) {
			return this.dr.findByQualification1(this.qr.findByQualificationName(qualificationName));
			
		}
		return null;
	}

}
