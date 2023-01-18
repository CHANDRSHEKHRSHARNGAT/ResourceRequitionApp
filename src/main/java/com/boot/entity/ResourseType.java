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
@Table(name="resourceType")
public class ResourseType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int resourceTypeId;
	
	@Column(nullable = false,unique = true,length=30)
	private String resourceTypeName;
	
	@OneToMany(mappedBy = "resourceType1", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Technology> technologies= new ArrayList<>();

	public ResourseType() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ResourseType [resourceTypeId=" + resourceTypeId + ", resourceTypeName=" + resourceTypeName
				+ ", technologies=" + technologies + "]";
	}

	public int getResourceTypeId() {
		return resourceTypeId;
	}

	public void setResourceTypeId(int resourceTypeId) {
		this.resourceTypeId = resourceTypeId;
	}

	public String getResourceTypeName() {
		return resourceTypeName;
	}

	public void setResourceTypeName(String resourceTypeName) {
		this.resourceTypeName = resourceTypeName;
	}

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}

}
