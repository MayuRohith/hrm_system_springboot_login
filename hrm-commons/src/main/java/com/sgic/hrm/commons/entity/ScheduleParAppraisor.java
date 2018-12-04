package com.sgic.hrm.commons.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ScheduleParAppraisor", schema = "employee")
public class ScheduleParAppraisor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="par_id")
	private Par parId;
	
	// to be enhanced
	private String appraisor_id;
	
	

	public ScheduleParAppraisor(Integer id,String appraisor_id) {
		this.id = id;
		this.appraisor_id = appraisor_id;
	}

	public ScheduleParAppraisor() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Par getParId() {
		return parId;
	}

	public void setParId(Par parId) {
		this.parId = parId;
	}

	public String getAppraisor_id() {
		return appraisor_id;
	}

	public void setAppraisor_id(String appraisor_id) {
		this.appraisor_id = appraisor_id;
	}

	

	
}
