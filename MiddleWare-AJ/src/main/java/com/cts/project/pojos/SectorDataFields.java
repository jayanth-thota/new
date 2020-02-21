package com.cts.project.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SectorDataFields")
public class SectorDataFields {
	@Id
	String id;
	String sectorname;
	String brief;
	@Override
	public String toString() {
		return "SectorDataFields [id=" + id + ", sectorname=" + sectorname + ", brief=" + brief + "]";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSectorname() {
		return sectorname;
	}
	public void setSectorname(String sectorname) {
		this.sectorname = sectorname;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	

}
