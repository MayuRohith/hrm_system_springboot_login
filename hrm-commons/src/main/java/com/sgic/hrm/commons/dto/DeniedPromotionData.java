package com.sgic.hrm.commons.dto;

import java.sql.Date;

public class DeniedPromotionData {
	
	private Integer id;
	private int requsetId;
	private int designationId;
	private Date deniedDate;
	private String deniedRemark;
	private String position;
	private int deniedBy;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getRequsetId() {
		return requsetId;
	}
	public void setRequsetId(int requsetId) {
		this.requsetId = requsetId;
	}
	public int getDesignationId() {
		return designationId;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	public Date getDeniedDate() {
		return deniedDate;
	}
	public void setDeniedDate(Date deniedDate) {
		this.deniedDate = deniedDate;
	}
	public String getDeniedRemark() {
		return deniedRemark;
	}
	public void setDeniedRemark(String deniedRemark) {
		this.deniedRemark = deniedRemark;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getDeniedBy() {
		return deniedBy;
	}
	public void setDeniedBy(int deniedBy) {
		this.deniedBy = deniedBy;
	}
	
	

}
