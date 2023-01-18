package com.boot.service;

import java.util.List;

import com.boot.entity.QualificationEntity;

public interface QualificationEntityService {

	public QualificationEntity addNewQualificationEntity(QualificationEntity qualification);
	public QualificationEntity editQualificationEntityById(int qualificationid,QualificationEntity qualification);
	public boolean deleteQualificationEntityById(int qualificationid);
	public QualificationEntity getQualificationEntityById(int qualificationid);
	public List<QualificationEntity> getAllQualifications();
	
	
}
