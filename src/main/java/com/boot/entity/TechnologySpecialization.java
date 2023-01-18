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
@Table(name="technology_Specialization")
public class TechnologySpecialization {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int techSpecializationId;

	@Column(nullable = false,unique = true,length=30)
	private String techSpecialaizationName;
	
	@ManyToOne
	@JoinColumn(name="technology_id")
	private Technology tech1;

	public int getTechSpecializationId() {
		return techSpecializationId;
	}

	public void setTechSpecializationId(int techSpecializationId) {
		this.techSpecializationId = techSpecializationId;
	}

	public String getTechSpecialaizationName() {
		return techSpecialaizationName;
	}

	public void setTechSpecialaizationName(String techSpecialaizationName) {
		this.techSpecialaizationName = techSpecialaizationName;
	}

	public Technology getTech1() {
		return tech1;
	}

	public void setTech1(Technology tech1) {
		this.tech1 = tech1;
	}

	@Override
	public String toString() {
		return "TechnologySpecialization [techSpecializationId=" + techSpecializationId + ", techSpecialaizationName="
				+ techSpecialaizationName + ", tech1=" + tech1 + "]";
	}

	public TechnologySpecialization() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
