package com.boot.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name ="temp_resource_Requesit")
public class TempResourseRequesitEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trrId;
	
	//(employeeId,EmpName,
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private EmployeeEntity employee;
	
	@Column(nullable = false)
	private Date lastSavedOn = new Date();
	
	@Column(nullable = false)
	private Date availabilityDate;
	
	@Column(nullable = false)
	private String workCountry = "India";
	
	@Column(nullable = false)
	private String workState = "Telangana";
	
	@Column(nullable = false)
	private String workCity = "Hyderabad";
	
	@Column(nullable = false)
	private boolean readyToWorkInShifts = false;
	
	@Column
	private String requestedBy;

	//Type Of Resource
	@Column(length=1000)
	private String hiringtype;

	@Column(length=1000)
	private String  technnologies ;
	
	//Technology Specialization
	@Column(length=1000)
	private String  skills ;
	
	@Column
	private String minQulaification;
	
	@Column
	private String domain;
	
	@Column
	private Date approvedOn;
	
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Date getApprovedOn() {
		return approvedOn;
	}

	public void setApprovedOn(Date approvedOn) {
		this.approvedOn = approvedOn;
	}

	public int getPositions() {
		return positions;
	}

	public void setPositions(int positions) {
		this.positions = positions;
	}

	@Column
	private String graduation;
	
	@Column
	private String graduationSpecialization;
	
	@Column
	private String postGraduation;
	
	@Column
	private String postGraduationSpecialization;

	
	@Column(nullable = false)
	private boolean relocationStatus = false;
	
	@Column(nullable = false)
	private int relocationPeriod = 30;
	
	@Column(nullable = false)
	private boolean visa = false;
	
	@Column(nullable = false)
	private int positions = 30;
	
	@Column(nullable = false)
	private int experiance = 0;
	
	//Incomplete 
	@Column(nullable = false)
	private int unitId = 0;
	
	
	@Column(nullable = false)
	private boolean passportStatus = false;
	
	@Column(nullable = false, length=8)
	private long salesOrderNumber;
	
	@Column(nullable = false)
	private long noOfJrs=0;
	
	@Column
	private String jd;

	@Column
	private String resourceType;

	@Column
	private String timeZone;
	
	@Column
	private String otherEducation;
		
	@Column
	private String otherSpecializations;

	

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	
	public int getTrrId() {
		return trrId;
	}

	public void setTrrId(int trrId) {
		this.trrId = trrId;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	public Date getCreatedOn() {
		return lastSavedOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.lastSavedOn = createdOn;
	}

	public Date getAvailabilityDate() {
		return availabilityDate;
	}

	public void setAvailabilityDate(Date availabilityDate) {
		this.availabilityDate = availabilityDate;
	}

	public String getWorkCountry() {
		return workCountry;
	}

	public void setWorkCountry(String workCountry) {
		this.workCountry = workCountry;
	}

	public String getWorkState() {
		return workState;
	}

	public void setWorkState(String workState) {
		this.workState = workState;
	}

	public String getWorkCity() {
		return workCity;
	}

	public void setWorkCity(String workCity) {
		this.workCity = workCity;
	}

	public boolean isReadyToWorkInShifts() {
		return readyToWorkInShifts;
	}

	public void setReadyToWorkInShifts(boolean readyToWorkInShifts) {
		this.readyToWorkInShifts = readyToWorkInShifts;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public String getHiringtype() {
		return hiringtype;
	}

	public void setHiringtype(String hiringtype) {
		this.hiringtype = hiringtype;
	}

	public String getTechnnologies() {
		return technnologies;
	}

	public void setTechnnologies(String technnologies) {
		this.technnologies = technnologies;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getMinQulaification() {
		return minQulaification;
	}

	public void setMinQulaification(String minQulaification) {
		this.minQulaification = minQulaification;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public String getGraduationSpecialization() {
		return graduationSpecialization;
	}

	public void setGraduationSpecialization(String graduationSpecialization) {
		this.graduationSpecialization = graduationSpecialization;
	}

	public String getPostGraduation() {
		return postGraduation;
	}

	public void setPostGraduation(String postGraduation) {
		this.postGraduation = postGraduation;
	}

	public String getPostGraduationSpecialization() {
		return postGraduationSpecialization;
	}

	public void setPostGraduationSpecialization(String postGraduationSpecialization) {
		this.postGraduationSpecialization = postGraduationSpecialization;
	}

	public boolean isRelocationStatus() {
		return relocationStatus;
	}

	public void setRelocationStatus(boolean relocationStatus) {
		this.relocationStatus = relocationStatus;
	}

	public int getRelocationPeriod() {
		return relocationPeriod;
	}

	public void setRelocationPeriod(int relocationPeriod) {
		this.relocationPeriod = relocationPeriod;
	}

	public boolean isVisa() {
		return visa;
	}

	public void setVisa(boolean visa) {
		this.visa = visa;
	}

	public int getPosition() {
		return positions;
	}

	public void setPosition(int position) {
		this.positions = position;
	}

	public int getExperiance() {
		return experiance;
	}

	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}

	public int getUnitId() {
		return unitId;
	}

	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}

	public boolean isPassportStatus() {
		return passportStatus;
	}

	public void setPassportStatus(boolean passportStatus) {
		this.passportStatus = passportStatus;
	}

	public long getSalesOrderNumber() {
		return salesOrderNumber;
	}

	public void setSalesOrderNumber(long salesOrderNumber) {
		this.salesOrderNumber = salesOrderNumber;
	}

	public long getNoOfJrs() {
		return noOfJrs;
	}

	public void setNoOfJrs(long noOfJrs) {
		this.noOfJrs = noOfJrs;
	}

	public String getJd() {
		return jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getOtherEducation() {
		return otherEducation;
	}

	public void setOtherEducation(String otherEducation) {
		this.otherEducation = otherEducation;
	}

	public String getOtherSpecializations() {
		return otherSpecializations;
	}

	public void setOtherSpecializations(String otherSpecializations) {
		this.otherSpecializations = otherSpecializations;
	}

	public TempResourseRequesitEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



}
