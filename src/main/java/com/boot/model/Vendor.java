package com.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "VENDOR")
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@NotNull
	@Pattern(regexp="[A-Z][a-zA-Z]*(\\\\s+[A-Z][a-zA-Z]*)*$")
	String vendorName;
	
	@NotNull
	@Max(99999)
	@Min(10000)
	Integer companyRegNo;
	
	@NotNull
	String vendorType;
	
	@NotNull
	String vendorAddress;
	
	@NotNull
	String vendorCountry;
	
	@NotNull
	String vendorState;
	
	@NotNull
	@Pattern(regexp="(https?:\\/\\/)?([\\w\\d]+\\.)?[\\w\\d]+\\.\\w+\\/?.+")
	String vendorWebsite;
	
	@NotNull
	@Pattern(regexp="^[_]*([a-z0-9]+(\\.|_*)?)+@([a-z][a-z0-9-]+(\\.|-*\\.))+[a-z]{2,6}$")
	String vendorEmail;
	
	@NotNull
	@Pattern(regexp="(^$|[0-9]{10})")
	String vendorContactNo;
	
	@NotNull
	Integer vendorEmployeeCount;
	
	@NotNull
	@Min(1900)
	@Max(2099)
	Integer vendorYearOfEstablishment;
	
	@NotNull
	@Min(1900)
	@Max(2099)
	Integer vendorCertificateIssueDate;
	
	@NotNull
	@Min(1900)
	@Max(2099)
	Integer vendorCertificateValidityDate;
	
	@NotNull
	String vendorCertificateGrade;
	
	@NotNull
	Integer vendorYearsOfSurvival;
	
	public Vendor() {
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

	public Integer getVendorEmployeeCount() {
		return vendorEmployeeCount;
	}

	public void setVendorEmployeeCount(Integer vendorEmployeeCount) {
		this.vendorEmployeeCount = vendorEmployeeCount;
	}

	public Integer getVendorYearOfEstablishment() {
		return vendorYearOfEstablishment;
	}

	public void setVendorYearOfEstablishment(Integer vendorYearOfEstablishment) {
		this.vendorYearOfEstablishment = vendorYearOfEstablishment;
	}

	public Integer getVendorCertificateIssueDate() {
		return vendorCertificateIssueDate;
	}

	public void setVendorCertificateIssueDate(Integer vendorCertificateIssueDate) {
		this.vendorCertificateIssueDate = vendorCertificateIssueDate;
	}

	public Integer getVendorCertificateValidityDate() {
		return vendorCertificateValidityDate;
	}

	public void setVendorCertificateValidityDate(Integer vendorCertificateValidityDate) {
		this.vendorCertificateValidityDate = vendorCertificateValidityDate;
	}

	public String getVendorCertificateGrade() {
		return vendorCertificateGrade;
	}

	public void setVendorCertificateGrade(String vendorCertificateGrade) {
		this.vendorCertificateGrade = vendorCertificateGrade;
	}

	public Integer getVendorYearsOfSurvival() {
		return vendorYearsOfSurvival;
	}

	public void setVendorYearsOfSurvival(Integer vendorYearsOfSurvival) {
		this.vendorYearsOfSurvival = vendorYearsOfSurvival;
	}

	public Vendor(Long id, String vendorName, Integer companyRegNo, String vendorType, String vendorAddress,
			String vendorCountry, String vendorState, String vendorWebsite, String vendorEmail, String vendorContactNo,
			Integer vendorEmployeeCount, Integer vendorYearOfEstablishment, Integer vendorCertificateIssueDate,
			Integer vendorCertificateValidityDate, String vendorCertificateGrade, Integer vendorYearsOfSurvival) {
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
		this.vendorCertificateIssueDate = vendorCertificateIssueDate;
		this.vendorCertificateValidityDate = vendorCertificateValidityDate;
		this.vendorCertificateGrade = vendorCertificateGrade;
		this.vendorYearsOfSurvival = vendorYearsOfSurvival;
	}

	
	
}
