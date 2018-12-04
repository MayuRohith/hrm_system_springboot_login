package com.sgic.hrm.commons.dto;

public class ScheduleParContentDTO {

	
    private String parContentId;
    private String parContentName;
    
    
	public ScheduleParContentDTO(String parContentId) {
	
		this.parContentId = parContentId;
	}
	
	public ScheduleParContentDTO() {
		
	}
	
	public String getParContentId() {
		return parContentId;
	}
	public void setParContentId(String parContentId) {
		this.parContentId = parContentId;
	}

	public String getParContentName() {
		return parContentName;
	}

	public void setParContentName(String parContentName) {
		this.parContentName = parContentName;
	}


	
    
}