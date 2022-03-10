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


@Table(name = "PropertyDetails")

@Entity
public class PropertyDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int propertyid;
	private String propertytype;
	private String areaname;
	private String cityname;
	private double propertyprice;
	private double constructionprice;
	
	
	
	@Override
	public String toString() {
		return "PropertyDetails [propertyid=" + propertyid + ", propertytype=" + propertytype + ", areaname=" + areaname
				+ ", cityname=" + cityname + ", propertyprice=" + propertyprice + ", constructionprice="
				+ constructionprice + "]";
	}
	public int getPropertyid() {
		return propertyid;
	}
	public void setPropertyid(int propertyid) {
		this.propertyid = propertyid;
	}
	public String getPropertytype() {
		return propertytype;
	}
	public void setPropertytype(String propertytype) {
		this.propertytype = propertytype;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public double getPropertyprice() {
		return propertyprice;
	}
	public void setPropertyprice(double propertyprice) {
		this.propertyprice = propertyprice;
	}
	public double getConstructionprice() {
		return constructionprice;
	}
	public void setConstructionprice(double constructionprice) {
		this.constructionprice = constructionprice;
	}

	
	
	


}
