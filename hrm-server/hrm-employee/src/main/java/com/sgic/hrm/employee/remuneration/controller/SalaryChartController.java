package com.sgic.hrm.employee.remuneration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.SalaryChartDto;
import com.sgic.hrm.commons.entity.SalaryChartEntity;
import com.sgic.hrm.commons.entity.mapper.SalaryChartEntityMapper;
import com.sgic.hrm.employee.remuneration.service.SalaryChartService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SalaryChartController {

	@Autowired
	private SalaryChartService salaryChartService;

	@GetMapping("/salarychart")
	public List<SalaryChartDto> getSalaryChart() {
		return SalaryChartEntityMapper
				.mapSalaryChartEntityListToSalaryChartDtoList(salaryChartService.viewSalaryChart());
	}

	@GetMapping("/salarychart/{id}")
	public SalaryChartEntity getDetailsById(@PathVariable Integer id) {
		return salaryChartService.viewOneById(id);
	}

}
