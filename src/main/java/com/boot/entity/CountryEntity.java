package com.boot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="country")
public class CountryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int countryId;
	
	@Column(nullable = false,unique = true,length=30)
	private String countryName;
	
	@OneToMany(mappedBy = "country1", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<StateEntity> states= new ArrayList<>();

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<StateEntity> getStates() {
		return states;
	}

	public void setStates(List<StateEntity> states) {
		this.states = states;
	}

	public CountryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CountryEntity [countryId=" + countryId + ", countryName=" + countryName + ", states=" + states + "]";
	}

}
