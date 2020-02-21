package com.cts.project.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Company {
	@Id
	String companyname;
	Float turnover;
	String ceo;
	String boardofdirectors;
	String listedinstockexchange;
	String sector;
	String briefwriteup;
	String stockcode;
	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", turnover=" + turnover + ", ceo=" + ceo + ", boardofdirectors="
				+ boardofdirectors + ", listedinstockexchange=" + listedinstockexchange + ", sector=" + sector
				+ ", briefwriteup=" + briefwriteup + ", stockcode=" + stockcode + "]";
	}
	
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Float getTurnover() {
		return turnover;
	}
	public void setTurnover(Float turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardofdirectors() {
		return boardofdirectors;
	}
	public void setBoardofdirectors(String boardofdirectors) {
		this.boardofdirectors = boardofdirectors;
	}
	public String getListedinstockexchange() {
		return listedinstockexchange;
	}
	public void setListedinstockexchange(String listedinstockexchange) {
		this.listedinstockexchange = listedinstockexchange;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBriefwriteup() {
		return briefwriteup;
	}
	public void setBriefwriteup(String briefwriteup) {
		this.briefwriteup = briefwriteup;
	}
	public String getStockcode() {
		return stockcode;
	}
	public void setStockcode(String stockcode) {
		this.stockcode = stockcode;
	}
	
	

}
