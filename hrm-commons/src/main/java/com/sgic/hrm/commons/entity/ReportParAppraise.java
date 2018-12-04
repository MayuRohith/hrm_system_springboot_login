package com.sgic.hrm.commons.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ReportParAppraise", schema = "employee")
public class ReportParAppraise {

	@Id
	private Integer id;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="par_id")
	private Par par;

//	@OneToMany(mappedBy="reportParAppraise",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	@JsonIgnore
//	private List<ScoreParAppraisee> scoreParAppraiseeList;

	public ReportParAppraise(int id) {
		this.id =id;
	}
	public ReportParAppraise() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Par getPar() {
		return par;
	}

	public void setPar(Par par) {
		this.par = par;
	}

//	public List<ScoreParAppraisee> getScoreParAppraiseeList() {
//		return scoreParAppraiseeList;
//	}
//
//	public void setScoreParAppraiseeList(List<ScoreParAppraisee> scoreParAppraiseeList) {
//		this.scoreParAppraiseeList = scoreParAppraiseeList;
//	}

}
