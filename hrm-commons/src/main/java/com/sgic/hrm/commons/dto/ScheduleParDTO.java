package com.sgic.hrm.commons.dto;

import java.util.Date;
import java.util.List;


public class ScheduleParDTO {

	private Integer id;
	private String empId;
	private Date scheduleDate;
	
	private List<ScheduleParAppraisorsDTO> scheduleParAppraisorsList;
	private List<ScheduleParContentDTO> scheduleParContentList;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public Date getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public List<ScheduleParAppraisorsDTO> getScheduleParAppraisorsList() {
		return scheduleParAppraisorsList;
	}
	public void setScheduleParAppraisorsList(List<ScheduleParAppraisorsDTO> scheduleParAppraisorsList) {
		this.scheduleParAppraisorsList = scheduleParAppraisorsList;
	}
	public List<ScheduleParContentDTO> getScheduleParContentList() {
		return scheduleParContentList;
	}
	public void setScheduleParContentList(List<ScheduleParContentDTO> scheduleParContentList) {
		this.scheduleParContentList = scheduleParContentList;
	}

	
	
}