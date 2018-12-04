package com.sgic.hrm.employee.remuneration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.BenefitsAllowancesDto;
import com.sgic.hrm.commons.entity.mapper.BenefitsAllowancesEntityMapper;
import com.sgic.hrm.employee.remuneration.service.BenefitsAllowancesService;

@RestController
@RequestMapping("/benefits")
@CrossOrigin(origins = "http://localhost:4200")
public class BenefitsAllowancesController {

	@Autowired
	private BenefitsAllowancesService benefitsAllowancesService;

	@GetMapping
	public List<BenefitsAllowancesDto> viewBenefitsAllowances() {
		return BenefitsAllowancesEntityMapper.mapBenefitsAllowancesEntityListToBenefitsAllowancesDtoList(
				benefitsAllowancesService.getBenefitsAllowances());
	}

//	@GetMapping
//	public BenefitsAllowancesDto viewBenefits(@RequestParam("id") Integer id) {
//		return BenefitsAllowancesEntityMapper
//				.mapBenefitsAllowancesEntityToBenefitsAllowancesDto(benefitsAllowancesService.viewById(id));
//	}

	@GetMapping("/{id}")
	public List<BenefitsAllowancesDto> viewbysalarychartId(@PathVariable Integer id) {
		return BenefitsAllowancesEntityMapper
				.mapBenefitsAllowancesEntityListToBenefitsAllowancesDtoList(benefitsAllowancesService.viewByChatId(id));
	}

}
