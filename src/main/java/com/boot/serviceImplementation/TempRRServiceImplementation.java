package com.boot.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.TempResourseRequesitEntity;
import com.boot.repository.TempRREntityRepository;
import com.boot.service.TempRRService;

@Service
public class TempRRServiceImplementation implements TempRRService{
	
	@Autowired
	public TempRREntityRepository trrr;

	@Override
	public TempResourseRequesitEntity addNewResourseRequesitEntity(TempResourseRequesitEntity trr) {
	
		return this.trrr.save(trr);
	}

}
