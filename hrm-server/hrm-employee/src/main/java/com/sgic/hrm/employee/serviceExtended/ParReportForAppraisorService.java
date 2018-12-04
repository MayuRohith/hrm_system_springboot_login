package com.sgic.hrm.employee.serviceExtended;

import java.util.List;

import com.sgic.hrm.commons.entity.ReportParAppraisor;
import com.sgic.hrm.commons.entity.ScoreParAppraisor;

public interface ParReportForAppraisorService {
	/*
	 * save report entity -save list of par score -save report record find the par
	 * object by par id save the ReportParAppraise including par object write
	 * iteratoror to save the List of ScoreParAppraisee
	 */
	public void saveReportAndScoreAppraisor(Integer parId, ReportParAppraisor reportParAppraisor,
			List<ScoreParAppraisor> scoreParAppraisorList);

}