package com.cjc.app.fl.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Table(name = "EnquiryDetails")

@Entity
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int enquiryId;
	private String name;
	private String dob;
	private int age;
	private String gender;
	private String email;
	private double mobileno;
	private String pancardno;
	private double adharcardno;
	private String status;
	private int cibil;
	
	
	
	
	@Override
	public String toString() {
		return "Enquiry [enquiryId=" + enquiryId + ", name=" + name + ", dob=" + dob + ", age=" + age + ", gender="
				+ gender + ", email=" + email + ", mobileno=" + mobileno + ", pancardno=" + pancardno + ", adharcardno="
				+ adharcardno + ", status=" + status + ", cibil=" + cibil + "]";
	}
	
	public int getCibil() {
		return cibil;
	}

	public void setCibil(int cibil) {
		this.cibil = cibil;
	}

	public int getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMobileno() {
		return mobileno;
	}
	public void setMobileno(double mobileno) {
		this.mobileno = mobileno;
	}
	public String getPancardno() {
		return pancardno;
	}
	public void setPancardno(String pancardno) {
		this.pancardno = pancardno;
	}
	public double getAdharcardno() {
		return adharcardno;
	}
	public void setAdharcardno(double adharcardno) {
		this.adharcardno = adharcardno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
}
