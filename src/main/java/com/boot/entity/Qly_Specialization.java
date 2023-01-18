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
@Table(name="qly_Specialization")
public class Qly_Specialization {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int specializationId;

		@Column(nullable = false,unique = true,length=30)
		private String specialaizationName;
		
		@ManyToOne
		@JoinColumn(name="degree_id")
		private Qly_Degree degree1;

		public Qly_Specialization() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Qly_Specialization [specializationId=" + specializationId + ", specialaizationName="
					+ specialaizationName + ", degree1=" + degree1 + "]";
		}

		public int getSpecializationId() {
			return specializationId;
		}

		public void setSpecializationId(int specializationId) {
			this.specializationId = specializationId;
		}

		public String getSpecialaizationName() {
			return specialaizationName;
		}

		public void setSpecialaizationName(String specialaizationName) {
			this.specialaizationName = specialaizationName;
		}

		public Qly_Degree getDegree1() {
			return degree1;
		}

		public void setDegree1(Qly_Degree degree1) {
			this.degree1 = degree1;
		}

}
