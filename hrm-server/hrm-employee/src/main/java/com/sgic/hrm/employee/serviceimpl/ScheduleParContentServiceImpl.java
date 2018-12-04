package com.sgic.hrm.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Par;
import com.sgic.hrm.commons.entity.ScheduleParContent;
import com.sgic.hrm.commons.repository.ScheduleParContentRepository;
import com.sgic.hrm.employee.service.ScheduleParContentService;



@Service
public class ScheduleParContentServiceImpl implements ScheduleParContentService{

	@Autowired
	ScheduleParContentRepository scheduleParContentRepo;
	
	@Override
	public void createScheduleParContent(ScheduleParContent scheduleParContent, Par par) {
		scheduleParContent.setParId(par);
		scheduleParContentRepo.save(scheduleParContent);
	}

	@Override
	public List<ScheduleParContent> findScheduleParContentByParId(Par parId) {
		// TODO Auto-generated method stub
		return scheduleParContentRepo.findByParId(parId);
	}
}
