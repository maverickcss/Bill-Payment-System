package com.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "VENDOR")
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@Column(name = "VendorName")
	String vendorName;
	@Column(name = "CompanyRegNo")
	Integer companyRegNo;
	@Column(name = "VendorType")
	String vendorType;
	@Column(name = "VendorAddress")
	String vendorAddress;
	@Column(name = "VendorCountry")
	String vendorCountry;
	@Column(name = "VendorState")
	String vendorState;
	@Column(name = "VendorWebsite")
	String vendorWebsite;
	@Column(name = "VendorEmail")
	@Email(message = "Invalid Email")
	String vendorEmail;
	@Column(name = "VendorContactNo")
	String vendorContactNo;
	@Column(name = "VendorEmployeeCount")
	String vendorEmployeeCount;
	@Column(name = "VendorYearOfEstablishment")
	String vendorYearOfEstablishment;
	
	public Vendor() {
	}

	public Vendor(Long id, String vendorName, Integer companyRegNo, String vendorType, String vendorAddress,
			String vendorCountry, String vendorState, String vendorWebsite, String vendorEmail, String vendorContactNo,
			String vendorEmployeeCount, String vendorYearOfEstablishment) {
		super();
		this.id = id;
		this.vendorName = vendorName;
		this.companyRegNo = companyRegNo;
		this.vendorType = vendorType;
		this.vendorAddress = vendorAddress;
		this.vendorCountry = vendorCountry;
		this.vendorState = vendorState;
		this.vendorWebsite = vendorWebsite;
		this.vendorEmail = vendorEmail;
		this.vendorContactNo = vendorContactNo;
		this.vendorEmployeeCount = vendorEmployeeCount;
		this.vendorYearOfEstablishment = vendorYearOfEstablishment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Integer getCompanyRegNo() {
		return companyRegNo;
	}

	public void setCompanyRegNo(Integer companyRegNo) {
		this.companyRegNo = companyRegNo;
	}

	public String getVendorType() {
		return vendorType;
	}

	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorCountry() {
		return vendorCountry;
	}

	public void setVendorCountry(String vendorCountry) {
		this.vendorCountry = vendorCountry;
	}

	public String getVendorState() {
		return vendorState;
	}

	public void setVendorState(String vendorState) {
		this.vendorState = vendorState;
	}

	public String getVendorWebsite() {
		return vendorWebsite;
	}

	public void setVendorWebsite(String vendorWebsite) {
		this.vendorWebsite = vendorWebsite;
	}

	public String getVendorEmail() {
		return vendorEmail;
	}

	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}

	public String getVendorContactNo() {
		return vendorContactNo;
	}

	public void setVendorContactNo(String vendorContactNo) {
		this.vendorContactNo = vendorContactNo;
	}

	public String getVendorEmployeeCount() {
		return vendorEmployeeCount;
	}

	public void setVendorEmployeeCount(String vendorEmployeeCount) {
		this.vendorEmployeeCount = vendorEmployeeCount;
	}

	public String getVendorYearOfEstablishment() {
		return vendorYearOfEstablishment;
	}

	public void setVendorYearOfEstablishment(String vendorYearOfEstablishment) {
		this.vendorYearOfEstablishment = vendorYearOfEstablishment;
	}

	
	
}
