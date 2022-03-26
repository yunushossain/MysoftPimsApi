package com.pims.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "informations")
public class Information {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int patientId;
	private String FamilyMemberName;
	private String relationship;
	private int phoneNo;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getFamilyMemberName() {
		return FamilyMemberName;
	}
	public void setFamilyMemberName(String familyMemberName) {
		FamilyMemberName = familyMemberName;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
