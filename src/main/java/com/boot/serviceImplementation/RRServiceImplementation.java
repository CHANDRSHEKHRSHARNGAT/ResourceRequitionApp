package com.boot.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.ResourceRequesitEntity;
import com.boot.repository.RRRepository;
import com.boot.service.RRService;

@Service
public class RRServiceImplementation implements RRService{
	
	@Autowired
	private RRRepository rrr;

	@Override
	public ResourceRequesitEntity addNewResourseRequesitEntity(ResourceRequesitEntity rr) {
		// TODO Auto-generated method stub
		return this.rrr.save(rr);
	}

}
