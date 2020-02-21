package com.cts.project.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stockprice")
public class StockPrice {
	@Id
	String companycode;
	String stockexchange;
	Float currentprice;
	Date opendatetime=new Date();
	@Override
	public String toString() {
		return "StockPrice [companycode=" + companycode + ", stockexchange=" + stockexchange + ", currentprice="
				+ currentprice + ", opendatetime=" + opendatetime + "]";
	}
	
	public String getCompanycode() {
		return companycode;
	}
	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}
	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}
	public Float getCurrentprice() {
		return currentprice;
	}
	public void setCurrentprice(Float currentprice) {
		this.currentprice = currentprice;
	}
	

}
