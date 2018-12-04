package com.sgic.hrm.employee.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.ReportParAppraise;
import com.sgic.hrm.commons.entity.ScoreParAppraisee;
import com.sgic.hrm.commons.repository.ScoreParAppraiseeRepository;
import com.sgic.hrm.employee.service.ScoreParAppraiseeService;

@Service
public class ScoreParAppraiseeServiceImpl implements ScoreParAppraiseeService {
	@Autowired
	ScoreParAppraiseeRepository scoreParAppraiseeRepo;

	@Override
	public void createScoreParAppraisee(ScoreParAppraisee scoreParAppraisee, ReportParAppraise reportParAppraise) {
		scoreParAppraisee.setReportParAppraise(reportParAppraise);
		scoreParAppraiseeRepo.save(scoreParAppraisee);

	}

}
