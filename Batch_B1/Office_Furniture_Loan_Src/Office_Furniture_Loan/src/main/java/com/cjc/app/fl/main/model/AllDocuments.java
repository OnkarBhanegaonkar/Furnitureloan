package com.cjc.app.fl.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Documents")

@Entity
public class AllDocuments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		
	private int docEntryId;

	private int cid;
	@Lob
	private byte[] addressproof;
	@Lob
	private byte[] pancard;
	@Lob
	private byte[] itr;
	@Lob
	private byte[] adharCard;
	@Lob
	private byte[] passphoto;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] thumbimprssion;
	@Lob
	private byte[] bankCheque;
	@Lob
	private byte[] bankStatement;
	
	private String status;

	public int getDocEntryId() {
		return docEntryId;
	}

	public void setDocEntryId(int docEntryId) {
		this.docEntryId = docEntryId;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public byte[] getAddressproof() {
		return addressproof;
	}

	public void setAddressproof(byte[] addressproof) {
		this.addressproof = addressproof;
	}

	public byte[] getPancard() {
		return pancard;
	}

	public void setPancard(byte[] pancard) {
		this.pancard = pancard;
	}

	public byte[] getItr() {
		return itr;
	}

	public void setItr(byte[] itr) {
		this.itr = itr;
	}

	public byte[] getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(byte[] adharCard) {
		this.adharCard = adharCard;
	}

	public byte[] getPassphoto() {
		return passphoto;
	}

	public void setPassphoto(byte[] passphoto) {
		this.passphoto = passphoto;
	}

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

	public byte[] getThumbimprssion() {
		return thumbimprssion;
	}

	public void setThumbimprssion(byte[] thumbimprssion) {
		this.thumbimprssion = thumbimprssion;
	}

	public byte[] getBankCheque() {
		return bankCheque;
	}

	public void setBankCheque(byte[] bankCheque) {
		this.bankCheque = bankCheque;
	}

	public byte[] getBankStatement() {
		return bankStatement;
	}

	public void setBankStatement(byte[] bankStatement) {
		this.bankStatement = bankStatement;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
