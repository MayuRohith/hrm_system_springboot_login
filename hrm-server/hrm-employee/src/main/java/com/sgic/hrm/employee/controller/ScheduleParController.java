package com.sgic.hrm.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.ScheduleParAppraisorsDTO;
import com.sgic.hrm.commons.dto.ScheduleParContentDTO;
import com.sgic.hrm.commons.dto.ScheduleParDTO;
import com.sgic.hrm.commons.entity.Par;
import com.sgic.hrm.employee.service.ParService;
import com.sgic.hrm.employee.serviceExtended.ParScheduleService;

@CrossOrigin
@RestController
public class ScheduleParController {

	@Autowired
	ParScheduleService parScheduleService;
	@Autowired
	ParService parservice;

	@GetMapping("/schedulepartemp")
	public ScheduleParDTO getSchedulePar() {
		ScheduleParDTO objScheduleParDTO = new ScheduleParDTO();

		List<ScheduleParAppraisorsDTO> scheduleParAppraisorList = new ArrayList<ScheduleParAppraisorsDTO>();
		scheduleParAppraisorList.add(new ScheduleParAppraisorsDTO("A001"));
		scheduleParAppraisorList.add(new ScheduleParAppraisorsDTO("A002"));
		scheduleParAppraisorList.add(new ScheduleParAppraisorsDTO("A003"));

		List<ScheduleParContentDTO> scheduleParContentList = new ArrayList<ScheduleParContentDTO>();
		scheduleParContentList.add(new ScheduleParContentDTO("C001"));
		scheduleParContentList.add(new ScheduleParContentDTO("C002"));

		objScheduleParDTO.setScheduleParAppraisorsList(scheduleParAppraisorList);
		objScheduleParDTO.setScheduleParContentList(scheduleParContentList);
		return objScheduleParDTO;
	}

	@PostMapping("/schedulepar")
	public void createSchedulePar(@RequestBody ScheduleParDTO objScheduleParDTO) {
		// boolean=
		Par par = new Par();
		par.setId(objScheduleParDTO.getId());
		par.setEmpId(objScheduleParDTO.getEmpId());
		par.setScheduleDate(objScheduleParDTO.getScheduleDate());
		parScheduleService.createSchedulePar(par, objScheduleParDTO.getScheduleParAppraisorsList(),
				objScheduleParDTO.getScheduleParContentList());
	}

	@GetMapping("/schedulepar/emp/{empid}")
	public ResponseEntity<List<Par>> findByEmployeeId(@PathVariable("empid") String id) {
		return new ResponseEntity<>(parservice.findByEmployeeId(id), HttpStatus.OK);
	}

	@GetMapping("/schedulepar/par/{parId}")
	public ResponseEntity<ScheduleParDTO> findByParId(@PathVariable("parId") Integer parId) {
		return new ResponseEntity<>(parScheduleService.getSchedulePar(parId), HttpStatus.OK);
	}

	@GetMapping("/schedulepar")
	public ResponseEntity<List<Par>> parHistory() {
		List<Par> par = parservice.parHistory();
		ResponseEntity<List<Par>> response = new ResponseEntity<>(par, HttpStatus.OK);
		return response;
	}

}