package com.sgic.hrm.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.ReportParAppraiseeDTO;
import com.sgic.hrm.commons.entity.ReportParAppraise;
import com.sgic.hrm.commons.entity.ScoreParAppraisee;
import com.sgic.hrm.employee.service.ParReportForAppraiseeService;



@RestController
public class ParReportForAppraiseeController {
	@Autowired
	ParReportForAppraiseeService parReportForAppraiseeService;

	@PostMapping("/parreportappraisee")
	public void createParReportForAppraisee(@RequestBody ReportParAppraiseeDTO reportParAppraiseeDTO) {
	ReportParAppraise objParReport = new ReportParAppraise(reportParAppraiseeDTO.getId());
	List<ScoreParAppraisee> scheduleParAppraisorList=reportParAppraiseeDTO.getScoreParAppraiseeList();
	parReportForAppraiseeService.saveReportAndScore(reportParAppraiseeDTO.getParId(), objParReport, scheduleParAppraisorList);
	}
	
	@GetMapping("/parreportappraisee")
	public ReportParAppraiseeDTO getParReportForAppraisee() {
		ReportParAppraiseeDTO reportParAppraiseeDTO=new ReportParAppraiseeDTO();
		ReportParAppraise objParReport = new ReportParAppraise(1);
		List<ScoreParAppraisee> scheduleParAppraisorList=new ArrayList<ScoreParAppraisee>();
		scheduleParAppraisorList.add(new ScoreParAppraisee(1,"C001",3.00));
		scheduleParAppraisorList.add(new ScoreParAppraisee(2,"C002",4.00));
		scheduleParAppraisorList.add(new ScoreParAppraisee(3,"C003",5.00));
		reportParAppraiseeDTO.setScoreParAppraiseeList(scheduleParAppraisorList);
		return reportParAppraiseeDTO; 
	}
	
}