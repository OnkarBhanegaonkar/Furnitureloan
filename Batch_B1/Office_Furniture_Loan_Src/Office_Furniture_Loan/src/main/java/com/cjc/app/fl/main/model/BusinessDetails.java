package com.cjc.app.fl.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "BusinessDetails")

@Entity
public class BusinessDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bankId;
	private String businessName;
	private String bankName;
	private String branchName;
	private String accountNo;
	private String ifscCode;
	private String turnOver;
	private String address ;
	
	
	@Override
	public String toString() {
		return "BusinessDetails [bankId=" + bankId + ", businessName=" + businessName + ", bankName=" + bankName
				+ ", branchName=" + branchName + ", accountNo=" + accountNo + ", ifscCode=" + ifscCode + ", turnOver="
				+ turnOver + ", address=" + address + "]";
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(String turnOver) {
		this.turnOver = turnOver;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

} 
