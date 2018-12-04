package com.sgic.hrm.employee.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Par;
import com.sgic.hrm.commons.entity.ReportParAppraisor;
import com.sgic.hrm.commons.repository.ReportParAppraisorRepository;
import com.sgic.hrm.employee.service.ReportParAppraisorService;

@Service
public class ReportParAppraisorServiceImpl implements ReportParAppraisorService {
	@Autowired
	ReportParAppraisorRepository reportParAppraisorRepo;

	@Override
	public void createReportParAppraise(ReportParAppraisor reportParAppraisor, Par par) {
		// TODO Auto-generated method stub
		reportParAppraisor.setParId(par);
		reportParAppraisorRepo.save(reportParAppraisor);

	}

}