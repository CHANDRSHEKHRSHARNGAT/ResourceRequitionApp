package com.boot.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.QualificationEntity;
import com.boot.repository.QualificationEntityRepository;
import com.boot.service.QualificationEntityService;

@Service
public class QualificationServiceImplementation implements QualificationEntityService {
	
	@Autowired
	public QualificationEntityRepository qr;

	@Override
	public QualificationEntity addNewQualificationEntity(QualificationEntity qualification) {
		
		return this.qr.save(qualification);
	}

	@Override
	public QualificationEntity editQualificationEntityById(int qualificationid, QualificationEntity qualification) {
		
		if(this.qr.existsById(qualificationid)) {
			return this.qr.save(qualification);
		}
		
		return null;
	}

	@Override
	public boolean deleteQualificationEntityById(int qualificationid) {
		if(this.qr.existsById(qualificationid)) {
			this.qr.deleteById(qualificationid);
			return true;
		}
		return false;
	}

	@Override
	public QualificationEntity getQualificationEntityById(int qualificationid) {
		
		if(this.qr.existsById(qualificationid))
		{
			System.out.println("inside");
			return this.qr.findById(qualificationid).get();
			
		}
		return null;
	}

	@Override
	public List<QualificationEntity> getAllQualifications() {
		
		return this.qr.findAll();
	}
	
	
}
