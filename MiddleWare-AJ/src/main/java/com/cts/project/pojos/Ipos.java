package com.cts.project.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="IPOS")
public class Ipos {
	@Id
String id;
String companyname;
String stockexchange;
Float pricepershare;
String totalnumberofshares;
String remarks;
Date opendatetime=new Date();
@Override
public String toString() {
	return "IPOS [id=" + id + ", companyname=" + companyname + ", stockexchange=" + stockexchange + ", pricepershare="
			+ pricepershare + ", totalnumberofshares=" + totalnumberofshares + ", remarks=" + remarks
			+ ", opendatetime=" + opendatetime + "]";
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public String getStockexchange() {
	return stockexchange;
}
public void setStockexchange(String stockexchange) {
	this.stockexchange = stockexchange;
}
public Float getPricepershare() {
	return pricepershare;
}
public void setPricepershare(Float pricepershare) {
	this.pricepershare = pricepershare;
}
public String getTotalnumberofshares() {
	return totalnumberofshares;
}
public void setTotalnumberofshares(String totalnumberofshares) {
	this.totalnumberofshares = totalnumberofshares;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
public Date getOpendatetime() {
	return opendatetime;
}
public void setOpendatetime(Date opendatetime) {
	this.opendatetime = opendatetime;
}


}
