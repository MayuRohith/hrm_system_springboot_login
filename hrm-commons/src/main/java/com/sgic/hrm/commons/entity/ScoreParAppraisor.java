package com.sgic.hrm.commons.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ScoreParAppraisor", schema = "employee")
public class ScoreParAppraisor {
	
	@Id
	private Integer id;
	private String parContentId;
	private Integer Score;
	
	@ManyToOne
	@JoinColumn(name="report_par_appraisor_id")
	private ReportParAppraisor reportParAppraisor;

	public Integer getId() {
		return id;
	}

	public ScoreParAppraisor(Integer id, String parContentId, Integer score) {
		
		this.id = id;
		this.parContentId = parContentId;
		this.Score=score;
	}
	
	public ScoreParAppraisor() {
		
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

	public Integer getScore() {
		return Score;
	}

	public void setScore(Integer score) {
		Score = score;
	}

	public ReportParAppraisor getReportParAppraisor() {
		return reportParAppraisor;
	}

	public void setReportParAppraisor(ReportParAppraisor reportParAppraisor) {
		this.reportParAppraisor = reportParAppraisor;
	}
	

}
