package com.sgic.hrm.employee.serviceExtended;

import java.util.List;

import com.sgic.hrm.commons.entity.ReportParAppraise;
import com.sgic.hrm.commons.entity.ScoreParAppraisee;

public interface ParReportForAppraiseeService {

	/*
	 * save report entity -save list of par score -save report record find the par
	 * object by par id save the ReportParAppraise including par object write
	 * iteratoror to save the List of ScoreParAppraisee
	 */
	public void saveReportAndScore(Integer parId, ReportParAppraise reportParAppraise,
			List<ScoreParAppraisee> scoreParAppraiseeList);

	// update one par score
	public boolean updateParScore();
}