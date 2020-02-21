package com.cts.project.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StockExchangeDataFields")
public class StockExchangeDataFields {
	@Id
	String id;
	String stockexchange;
	String brief;
	String contactaddress;
	String remarks;

	@Override
	public String toString() {
		return "StockExchangeDataFields [id=" + id + ", stockexchange=" + stockexchange + ", brief=" + brief
				+ ", contactaddress=" + contactaddress + ", remarks=" + remarks + "]";
	}
		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactaddress() {
		return contactaddress;
	}
	public void setContactaddress(String contactaddress) {
		this.contactaddress = contactaddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	

}
