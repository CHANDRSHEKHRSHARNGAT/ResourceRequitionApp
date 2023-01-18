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
@Table(name="qualification")
public class QualificationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qualificationId;
	
	@Column(nullable = false,unique = true,length=30)
	private String qualificationName;
	
	@OneToMany(mappedBy = "qualification1", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Qly_Degree> degrees= new ArrayList<>();

	public List<Qly_Degree> getDegrees() {
		return degrees;
	}

	public void setDegrees(List<Qly_Degree> degrees) {
		this.degrees = degrees;
	}

	@Override
	public String toString() {
		return "QualificationEntity [qualificationId=" + qualificationId + ", qualificationName=" + qualificationName
				+ ", degrees=" + degrees + "]";
	}

	public int getQualificationId() {
		return qualificationId;
	}

	public void setQualificationId(int qualificationId) {
		this.qualificationId = qualificationId;
	}

	public String getQualificationName() {
		return qualificationName;
	}

	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}

	public QualificationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
