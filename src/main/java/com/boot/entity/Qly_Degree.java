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
@Table(name="qly_Degree")
public class Qly_Degree {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int degreeId;
	
//	@Column(nullable = false,length=30)
//	private String qlyId;
	
	@Column(nullable = false,unique = true,length=30)
	private String degreeName;
	
	@ManyToOne
	@JoinColumn(name="qualification_id")
	private QualificationEntity qualification1;
	
	@OneToMany(mappedBy = "degree1", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Qly_Specialization>  specilization1;

	@Override
	public String toString() {
		return "Qly_Degree [degreeId=" + degreeId + ", degreeName=" + degreeName + ", qualification1=" + qualification1
				+ "]";
	}

	public int getDegreeId() {
		return degreeId;
	}

	public void setDegreeId(int degreeId) {
		this.degreeId = degreeId;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public QualificationEntity getQualification1() {
		return qualification1;
	}

	public void setQualification1(QualificationEntity qualification1) {
		this.qualification1 = qualification1;
	}

	public Qly_Degree() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
