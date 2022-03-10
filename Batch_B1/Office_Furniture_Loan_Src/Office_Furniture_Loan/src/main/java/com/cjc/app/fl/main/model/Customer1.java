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


@Table(name = "CustomerDetails")

@Entity
public class Customer1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String name;
	private String dob;
	private int age;
	private String gender;
	private String email;
	private long mobileno;
	private long alternatemobileno;
	private double loanAmaount;
	private int duration;
	private int cibilscore;
	
	

	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customeraddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BusinessDetails businessDetails;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyDetails propertyDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Guarantor guarantor;
	
	
	


	@Override
	public String toString() {
		return "Customer1 [cid=" + cid + ", name=" + name + ", dob=" + dob + ", age=" + age + ", gender=" + gender
				+ ", email=" + email + ", mobileno=" + mobileno + ", alternatemobileno=" + alternatemobileno
				+ ", loanAmaount=" + loanAmaount + ", duration=" + duration + ", cibilscore=" + cibilscore
				+ ", customeraddress=" + customeraddress + ", businessDetails=" + businessDetails + ", propertyDetails="
				+ propertyDetails + ", guarantor=" + guarantor + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
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

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public long getAlternatemobileno() {
		return alternatemobileno;
	}

	public void setAlternatemobileno(long alternatemobileno) {
		this.alternatemobileno = alternatemobileno;
	}

	public double getLoanAmaount() {
		return loanAmaount;
	}

	public void setLoanAmaount(double loanAmaount) {
		this.loanAmaount = loanAmaount;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getCibilscore() {
		return cibilscore;
	}

	public void setCibilscore(int cibilscore) {
		this.cibilscore = cibilscore;
	}

	public CustomerAddress getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(CustomerAddress customeraddress) {
		this.customeraddress = customeraddress;
	}

	public BusinessDetails getBusinessDetails() {
		return businessDetails;
	}

	public void setBusinessDetails(BusinessDetails businessDetails) {
		this.businessDetails = businessDetails;
	}

	public PropertyDetails getPropertyDetails() {
		return propertyDetails;
	}

	public void setPropertyDetails(PropertyDetails propertyDetails) {
		this.propertyDetails = propertyDetails;
	}

	public Guarantor getGuarantor() {
		return guarantor;
	}

	public void setGuarantor(Guarantor guarantor) {
		this.guarantor = guarantor;
	}


	

	
	
	
}
