package com.cjc.app.fl.main.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "GuarantorDetails")

@Entity
public class Guarantor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gid;
	private String name;
	private String dob;
	private String mobileNo;
	private String gender;
	private String emailId;
	private String adharNo;
//	private byte [ ] adhacard;
	
	
	
	@Override
	public String toString() {
		return "Guarantor [gid=" + gid + ", name=" + name + ", dob=" + dob + ", mobileNo=" + mobileNo + ", gender="
				+ gender + ", emailId=" + emailId + ", adharNo=" + adharNo + "]";
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	


}
