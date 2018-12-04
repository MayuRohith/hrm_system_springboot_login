package com.sgic.hrm.employee.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Par;
import com.sgic.hrm.commons.entity.ReportParAppraise;
import com.sgic.hrm.commons.repository.ReportParAppraiseRepository;
import com.sgic.hrm.employee.service.ReportParAppraiseeService;



@Service
public class ReportParAppraiseServiceImpl implements ReportParAppraiseeService
{

	@Autowired
	ReportParAppraiseRepository reportParAppraiseRepo;
	
	public void createReportParAppraise(ReportParAppraise reportParAppraise,Par par) {
	
			reportParAppraise.setPar(par);
			reportParAppraiseRepo.save(reportParAppraise);
		
	}
}