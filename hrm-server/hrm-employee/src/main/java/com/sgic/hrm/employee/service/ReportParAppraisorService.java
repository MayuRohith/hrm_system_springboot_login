package com.sgic.hrm.employee.service;

import com.sgic.hrm.commons.entity.Par;
import com.sgic.hrm.commons.entity.ReportParAppraisor;

public interface ReportParAppraisorService {
	public void createReportParAppraise(ReportParAppraisor reportParAppraisor,Par par);
}