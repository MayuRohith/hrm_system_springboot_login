package com.sgic.hrm.commons.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ScoreParAppraisee", schema = "employee")
public class ScoreParAppraisee {
	
	@Id
	private Integer id;
	private String parContentId;
	private Double score;
	
	@ManyToOne
	@JoinColumn(name="report_par_appraise_id")
	private ReportParAppraise reportParAppraise;
	
	public ScoreParAppraisee(int id, String parContentId,Double score) {
	this.id= id;
	this.parContentId =parContentId;
	this.score =score;
	}
	
	public ScoreParAppraisee() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getParContentId() {
		return parContentId;
	}

	public void setParContentId(String parContentId) {
		this.parContentId = parContentId;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public ReportParAppraise getReportParAppraise() {
		return reportParAppraise;
	}

	public void setReportParAppraise(ReportParAppraise reportParAppraise) {
		this.reportParAppraise = reportParAppraise;
	}

	

}
