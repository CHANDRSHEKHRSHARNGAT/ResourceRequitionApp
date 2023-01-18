package com.boot.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.TimeZone;
import com.boot.repository.TimeZoneRepository;
import com.boot.service.TimeZoneService;

@Service
public class TimeZoneServiceImplementation implements TimeZoneService{
	
	@Autowired
	 private TimeZoneRepository tzr;

	@Override
	public TimeZone addNewTimeZone(TimeZone newtz) {
		
		return this.tzr.save(newtz);
	}

	@Override
	public List<TimeZone> getAllTimeZones() {
		
		return this.tzr.findAll();
	}

}
