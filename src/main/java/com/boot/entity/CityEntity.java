package com.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class CityEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cityId;

	@Column(nullable = false,unique = true,length=30)
	private String cityName;
	
	@ManyToOne
	@JoinColumn(name="state_id")
	private StateEntity state1;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public StateEntity getState1() {
		return state1;
	}

	public void setState1(StateEntity state1) {
		this.state1 = state1;
	}

	public CityEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CityEntity [cityId=" + cityId + ", cityName=" + cityName + ", state1=" + state1 + "]";
	}
	
	

	

}
