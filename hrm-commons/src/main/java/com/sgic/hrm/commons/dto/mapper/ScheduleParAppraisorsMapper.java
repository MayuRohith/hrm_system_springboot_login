package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.ScheduleParAppraisorsDTO;
import com.sgic.hrm.commons.entity.ScheduleParAppraisor;

public class ScheduleParAppraisorsMapper {

	public static ScheduleParAppraisor dtoToEntity(ScheduleParAppraisorsDTO scheduleParAppraisorsDTO) {
		ScheduleParAppraisor scheduleParAppraisor=new ScheduleParAppraisor();
		scheduleParAppraisor.setAppraisor_id(scheduleParAppraisorsDTO.getAppraisorId());
		return scheduleParAppraisor;
	}
	
	public static ScheduleParAppraisorsDTO entityToDto(ScheduleParAppraisor scheduleParAppraisor) {
		ScheduleParAppraisorsDTO scheduleParAppraisorDTO=new ScheduleParAppraisorsDTO();
		scheduleParAppraisorDTO.setAppraisorId(scheduleParAppraisor.getAppraisor_id());
		
	
		return scheduleParAppraisorDTO;
	}
}