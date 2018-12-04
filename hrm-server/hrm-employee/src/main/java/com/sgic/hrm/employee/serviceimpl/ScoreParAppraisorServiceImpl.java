package com.sgic.hrm.employee.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.ReportParAppraisor;
import com.sgic.hrm.commons.entity.ScoreParAppraisor;
import com.sgic.hrm.commons.repository.ScoreParAppraisorRepository;
import com.sgic.hrm.employee.service.ScoreParAppraisorService;


@Service
public class ScoreParAppraisorServiceImpl implements  ScoreParAppraisorService {
@Autowired
ScoreParAppraisorRepository scoreParAppraisorRepo;
	@Override
	public void createScoreParAppraisor(ScoreParAppraisor scoreParAppraisor, ReportParAppraisor reportParAppraisor) {
		// TODO Auto-generated method stub
		scoreParAppraisor.setReportParAppraisor(reportParAppraisor);
		scoreParAppraisorRepo.save(scoreParAppraisor);
		
	}

}
