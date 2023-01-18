package com.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="timezone")
public class TimeZone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int timezoneId;
	
	 
	
	@Column(unique=true)
	String timezoneName;


	public int getTimezoneId() {
		return timezoneId;
	}

	public void setTimezoneId(int timezoneId) {
		this.timezoneId = timezoneId;
	}

	public String getTimezoneName() {
		return timezoneName;
	}

	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}

	@Override
	public String toString() {
		return "TimeZone [timeZoneId=" + timezoneId + ", timezoneName=" + timezoneName + "]";
	}

	public TimeZone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
