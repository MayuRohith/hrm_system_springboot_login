package com.sgic.hrm.commons.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ReportParAppraisor", schema = "employee")
public class ReportParAppraisor {
	
	@Id
	private Integer id;
	
	@ManyToOne()
	@JoinColumn(name="par_id")
	private Par parId;
	
	private String appraisorId;
	
	private Double appraisorScore;
	
	
//	@OneToMany(mappedBy="reportParAppraisor",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	@JsonIgnore
//	private List<ScoreParAppraisor> scoreParAppraisors;
 
	

	public ReportParAppraisor(Integer id, String appraisorId, Double appraisorScore) {
		this.id = id;
		this.appraisorId = appraisorId;
		this.appraisorScore = appraisorScore;
	}
	
	public ReportParAppraisor(String appraisorId, Double appraisorScore) {
		this.appraisorId = appraisorId;
		this.appraisorScore = appraisorScore;
	}

	public ReportParAppraisor() {
		
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

	public String getAppraisorId() {
		return appraisorId;
	}

	public void setAppraisorId(String appraisorId) {
		this.appraisorId = appraisorId;
	}

	
	public Double getAppraisorScore() {
		return appraisorScore;
	}

	public void setAppraisorScore(Double appraisorScore) {
		this.appraisorScore = appraisorScore;
	}

//	public List<ScoreParAppraisor> getScoreParAppraisors() {
//		return scoreParAppraisors;
//	}
//
//	public void setScoreParAppraisors(List<ScoreParAppraisor> scoreParAppraisors) {
//		this.scoreParAppraisors = scoreParAppraisors;
//	}
	
	
	

}
