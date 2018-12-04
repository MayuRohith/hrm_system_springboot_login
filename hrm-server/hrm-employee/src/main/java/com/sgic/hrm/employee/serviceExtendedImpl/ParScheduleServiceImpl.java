package com.sgic.hrm.employee.serviceExtendedImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.dto.ScheduleParAppraisorsDTO;
import com.sgic.hrm.commons.dto.ScheduleParContentDTO;
import com.sgic.hrm.commons.dto.ScheduleParDTO;
import com.sgic.hrm.commons.dto.mapper.ScheduleParAppraisorsMapper;
import com.sgic.hrm.commons.dto.mapper.ScheduleParContentMapper;
import com.sgic.hrm.commons.entity.Par;
import com.sgic.hrm.commons.entity.ScheduleParAppraisor;
import com.sgic.hrm.commons.entity.ScheduleParContent;
import com.sgic.hrm.employee.service.ParService;
import com.sgic.hrm.employee.service.ScheduleParAppraisorService;
import com.sgic.hrm.employee.service.ScheduleParContentService;
import com.sgic.hrm.employee.serviceExtended.ParScheduleService;



@Service
public class ParScheduleServiceImpl implements ParScheduleService {

	@Autowired
	ParService parService;

	@Autowired
	ScheduleParAppraisorService scheduleParAppraisorService;

	@Autowired
	ScheduleParContentService scheduleParContentService;


	@Override
	public ScheduleParDTO getSchedulePar(Integer parId) {
		Par par = parService.findParById(parId);
		Iterator<ScheduleParAppraisor> iteratorScheduledAppraisor = scheduleParAppraisorService
				.findScheduleParAppraisorByParId(par).iterator();
	
		List<ScheduleParAppraisorsDTO> listScheduleParAppraisorDTO = new ArrayList<>();
		while (iteratorScheduledAppraisor.hasNext()) {

			listScheduleParAppraisorDTO.add(ScheduleParAppraisorsMapper.entityToDto(iteratorScheduledAppraisor.next()));
		}
		
		Iterator<ScheduleParContent> iteratorScheduleParContent = scheduleParContentService
				.findScheduleParContentByParId(par).iterator();
		List<ScheduleParContentDTO> listScheduleParContentDTO = new ArrayList<>();
		while (iteratorScheduleParContent.hasNext()) {
			listScheduleParContentDTO.add(ScheduleParContentMapper.entityToDto(iteratorScheduleParContent.next()));
		}

		ScheduleParDTO scheduleParDTO = new ScheduleParDTO();
		scheduleParDTO.setScheduleParAppraisorsList(listScheduleParAppraisorDTO);
		scheduleParDTO.setScheduleParContentList(listScheduleParContentDTO);
		return scheduleParDTO;
	}


	@Override
	public void createSchedulePar(Par par, List<ScheduleParAppraisorsDTO> scheduleParAppraisorList,
			List<ScheduleParContentDTO> scheduleParContentList) {
		// save par object
		parService.createPar(par);

		// save Appraisor List
		Iterator<ScheduleParAppraisorsDTO> iteratorScheduledAppraisor = scheduleParAppraisorList.iterator();
		while (iteratorScheduledAppraisor.hasNext()) {

			scheduleParAppraisorService.createScheduleParAppraisor(
					ScheduleParAppraisorsMapper.dtoToEntity(iteratorScheduledAppraisor.next()), par);
		}

		// save Content List
		Iterator<ScheduleParContentDTO> iteratorScheduledContent = scheduleParContentList.iterator();
		while (iteratorScheduledContent.hasNext()) {
			scheduleParContentService.createScheduleParContent(
					ScheduleParContentMapper.dtoToEntity(iteratorScheduledContent.next()), par);
		}
		
	}

}