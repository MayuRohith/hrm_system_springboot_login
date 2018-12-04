package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.Par;
import com.sgic.hrm.commons.entity.ScheduleParAppraisor;

public interface ScheduleParAppraisorService {

	public void createScheduleParAppraisor(ScheduleParAppraisor scheduleParAppraisor,Par par);
	
	public List<ScheduleParAppraisor>findScheduleParAppraisorByParId(Par parId);
}
