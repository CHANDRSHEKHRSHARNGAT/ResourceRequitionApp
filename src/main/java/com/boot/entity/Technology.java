package com.boot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="technology")
public class Technology {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int technologyId;
		
	@Column(nullable = false,unique = true,length=30)
	private String technologyName;
	
	@ManyToOne
	@JoinColumn(name="resource_type_id")
	private ResourseType resourceType1;
	
	@OneToMany(mappedBy = "tech1", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<TechnologySpecialization>  technologiSpecializations;

	public int getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}

	public ResourseType getResourceType1() {
		return resourceType1;
	}

	public void setResourceType1(ResourseType resourceType1) {
		this.resourceType1 = resourceType1;
	}

	public List<TechnologySpecialization> getTechnologiSpecializations() {
		return technologiSpecializations;
	}

	public void setTechnologiSpecializations(List<TechnologySpecialization> technologiSpecializations) {
		this.technologiSpecializations = technologiSpecializations;
	}

	
	
	

}
