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
	@Column(name = "CustomerName")
	String customerName;
	@Column(name = "CustomerAddress")
	String customerAddress;
	@Column(name = "CustomerContactNo")
	Integer customerContactNo;
	@Column(name = "CustomerCountry")
	String customerCountry;
	@Column(name = "CustomerState")
	String customerState;
	@Column(name = "CustomerEmail")
	String customerEmail;
	@Column(name = "CustomerIdentificationDocument")
	String customerIdentificationDocument;
	@Column(name = "IdentificationDocumentNumber")
	String identificationDocumentNumber;
	@Column(name = "CardNo")
	String cardNo;
	@Column(name = "CardValidityDate")
	String cardValidityDate;
	@Column(name = "CardCvv")
	String cardCvv;
	
	public Customer() {
	}

	public Customer(Long id, String customerName, String customerAddress, Integer customerContactNo,
			String customerCountry, String customerState, String customerEmail, String customerIdentificationDocument,
			String identificationDocumentNumber, String cardNo, String cardValidityDate, String cardCvv) {
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
		this.cardNo = cardNo;
		this.cardValidityDate = cardValidityDate;
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

	public Integer getCustomerContactNo() {
		return customerContactNo;
	}

	public void setCustomerContactNo(Integer customerContactNo) {
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

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardValidityDate() {
		return cardValidityDate;
	}

	public void setCardValidityDate(String cardValidityDate) {
		this.cardValidityDate = cardValidityDate;
	}

	public String getCardCvv() {
		return cardCvv;
	}

	public void setCardCvv(String cardCvv) {
		this.cardCvv = cardCvv;
	}

		
}