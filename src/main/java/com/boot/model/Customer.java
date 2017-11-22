package com.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String customerName;
	String customerAddress;
	String customerContactNo;
	String customerCountry;
	String customerState;
	String customerEmail;
	String customerIdentificationDocument;
	String identificationDocumentNumber;
	String typeOfVendor;
	String vendorName;
	String cardNo;
	String cardValidityMM;
	String cardValidityYYYY;
	String cardCvv;
	
	public Customer() {
	}

	public Customer(Long id, String customerName, String customerAddress, String customerContactNo,
			String customerCountry, String customerState, String customerEmail, String customerIdentificationDocument,
			String identificationDocumentNumber, String typeOfVendor, String vendorName, String cardNo,
			String cardValidityMM, String cardValidityYYYY, String cardCvv) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerContactNo = customerContactNo;
		this.customerCountry = customerCountry;
		this.customerState = customerState;
		this.customerEmail = customerEmail;
		this.customerIdentificationDocument = customerIdentificationDocument;
		this.identificationDocumentNumber = identificationDocumentNumber;
		this.typeOfVendor = typeOfVendor;
		this.vendorName = vendorName;
		this.cardNo = cardNo;
		this.cardValidityMM = cardValidityMM;
		this.cardValidityYYYY = cardValidityYYYY;
		this.cardCvv = cardCvv;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerContactNo() {
		return customerContactNo;
	}

	public void setCustomerContactNo(String customerContactNo) {
		this.customerContactNo = customerContactNo;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerIdentificationDocument() {
		return customerIdentificationDocument;
	}

	public void setCustomerIdentificationDocument(String customerIdentificationDocument) {
		this.customerIdentificationDocument = customerIdentificationDocument;
	}

	public String getIdentificationDocumentNumber() {
		return identificationDocumentNumber;
	}

	public void setIdentificationDocumentNumber(String identificationDocumentNumber) {
		this.identificationDocumentNumber = identificationDocumentNumber;
	}

	public String getTypeOfVendor() {
		return typeOfVendor;
	}

	public void setTypeOfVendor(String typeOfVendor) {
		this.typeOfVendor = typeOfVendor;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardValidityMM() {
		return cardValidityMM;
	}

	public void setCardValidityMM(String cardValidityMM) {
		this.cardValidityMM = cardValidityMM;
	}

	public String getCardValidityYYYY() {
		return cardValidityYYYY;
	}

	public void setCardValidityYYYY(String cardValidityYYYY) {
		this.cardValidityYYYY = cardValidityYYYY;
	}

	public String getCardCvv() {
		return cardCvv;
	}

	public void setCardCvv(String cardCvv) {
		this.cardCvv = cardCvv;
	}

		
}