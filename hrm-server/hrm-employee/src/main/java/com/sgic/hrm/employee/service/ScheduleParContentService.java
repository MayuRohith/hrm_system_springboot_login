package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.Par;
import com.sgic.hrm.commons.entity.ScheduleParContent;

public interface ScheduleParContentService {

	public void createScheduleParContent(ScheduleParContent scheduleParContent,Par par);
	public List<ScheduleParContent>findScheduleParContentByParId(Par parId);
}
