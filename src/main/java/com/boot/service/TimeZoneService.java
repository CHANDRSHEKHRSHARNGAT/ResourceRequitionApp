package com.boot.service;

import java.util.List;

import com.boot.entity.TimeZone;

public interface TimeZoneService {
	
	public TimeZone addNewTimeZone(TimeZone newtz);
	public List<TimeZone> getAllTimeZones();
	
	

}
