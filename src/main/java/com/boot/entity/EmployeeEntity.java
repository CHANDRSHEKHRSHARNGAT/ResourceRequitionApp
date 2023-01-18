package com.boot.entity;

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
@Table(name="employee")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	
	@Column(nullable = false)
	private String employeeName;
	
	@Column(nullable=false,unique=true)
	private String employeeEmail;
	
	@Column(nullable=false)
	private int managaerId;
	
	@Column(nullable=false,length=10)
	private String 	employeePassword ;
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<TempResourseRequesitEntity>  trrs;
	
	@OneToMany(mappedBy = "employee1", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<ResourceRequesitEntity>  rrs;


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public int getManagaerId() {
		return managaerId;
	}

	public void setManagaerId(int managaerId) {
		this.managaerId = managaerId;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", managaerId=" + managaerId + ", employeePassword=" + employeePassword + "]";
	}

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
