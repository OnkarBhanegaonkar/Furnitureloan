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


@Table(name = "Cibil")

@Entity
public class Cibil {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cibilId;	
	private String cid;	
	private String cibilScore;	
	private String panCard;
	private String cibilGeneratedDate;	
	private String cibilGeneratedBy;	
	private String cmRemark;
	public int getCibilId() {
		return cibilId;
	}
	public void setCibilId(int cibilId) {
		this.cibilId = cibilId;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(String cibilScore) {
		this.cibilScore = cibilScore;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getCibilGeneratedDate() {
		return cibilGeneratedDate;
	}
	public void setCibilGeneratedDate(String cibilGeneratedDate) {
		this.cibilGeneratedDate = cibilGeneratedDate;
	}
	public String getCibilGeneratedBy() {
		return cibilGeneratedBy;
	}
	public void setCibilGeneratedBy(String cibilGeneratedBy) {
		this.cibilGeneratedBy = cibilGeneratedBy;
	}
	public String getCmRemark() {
		return cmRemark;
	}
	public void setCmRemark(String cmRemark) {
		this.cmRemark = cmRemark;
	}
	
}
