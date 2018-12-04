package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.InterviewScheduleData;
import com.sgic.hrm.commons.entity.InterviewSchedule;

public class InterviewScheduleDataMapper {
public InterviewScheduleDataMapper() {
		
	}
	
	public static InterviewSchedule interviewScheduleDataMapper(InterviewScheduleData InterviewScheduleData) {
		InterviewSchedule interviewSchedule = new InterviewSchedule();

		interviewSchedule.setId(InterviewScheduleData.getId());
		interviewSchedule.setInterviewVenue(InterviewScheduleData.getInterviewVenue());
		interviewSchedule.setInterviewTime(InterviewScheduleData.getInterviewTime());
		interviewSchedule.setInterviewDate(InterviewScheduleData.getInterviewDate());
		interviewSchedule.setApplicant(ApplicantDataMapper.applicantDataMapper(InterviewScheduleData.getApplicant()));
	    
		
	    return interviewSchedule;
	  }


}
