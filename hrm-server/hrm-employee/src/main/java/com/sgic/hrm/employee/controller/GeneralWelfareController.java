package com.sgic.hrm.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.GeneralWelfareData;
import com.sgic.hrm.commons.dto.mapper.GeneralWelfareDataToGeneralWelfare;
import com.sgic.hrm.commons.entity.mapper.GeneralWelfareToGneralWelfareData;
import com.sgic.hrm.employee.service.GeneralWelfareService;


@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
@RestController
public class GeneralWelfareController {
	@Autowired
	private GeneralWelfareService generalWelfareService;
	

//	@GetMapping("/generalWelfare/{id}")
//	public ResponseEntity<GeneralWelfareData> getById(@PathVariable(name = "id") Integer id) {
//		return new ResponseEntity<>(
//				GeneralWelfareToGneralWelfareData.maptoGeneralWelfareData(generalWelfareService.getById(id)),
//				HttpStatus.OK);
//	}

//	@GetMapping("/generalWelfare")
//	public ResponseEntity<List<GeneralWelfareData>> getAllGeneralWelfare() {
//
//		return new ResponseEntity<>(GeneralWelfareToGneralWelfareData
//				.maptoGeneralWelfareDataList(generalWelfareService.getAllGeneralWelfare()), HttpStatus.OK);
//	}

	@PostMapping("/generalWelfare")
	//public ResponseEntity<String> createGeneralWelfare(@RequestBody GeneralWelfareData generalWelfareData) {

//		if (generalWelfareService
//				.createGeneralWelfare(GeneralWelfareDataToGeneralWelfare.maptoGeneralWelfare(generalWelfareData))) {
//			return new ResponseEntity<>("GeneralWelfare Create Succesfully ", HttpStatus.OK);
//		}
//		return new ResponseEntity<>("GeneralWelfare Create Failed ", HttpStatus.BAD_REQUEST);
//	}

	@PutMapping("/generalWelfare/{id}")
//	public ResponseEntity<String> updateGeneralWelfare(@PathVariable(name = "id") Integer id,
//			@RequestBody GeneralWelfareData generalWelfareData) {
//		if (generalWelfareService.updateGeneralWelfare(
//				GeneralWelfareDataToGeneralWelfare.maptoGeneralWelfare(generalWelfareData), id)) {
//			return new ResponseEntity<>("GeneralWelfare Update Succesfully ", HttpStatus.OK);
//		}
//		return new ResponseEntity<>("GeneralWelfare Update Failed ", HttpStatus.BAD_REQUEST);
//	}

	@DeleteMapping("/generalWelfare/{id}")
	public ResponseEntity<String> deleteGeneralWelfare(@PathVariable(name = "id") Integer id) {
		if (generalWelfareService.deleteGeneralWelfare(id)) {
			return new ResponseEntity<>("GeneralWelfare Delete Succesfully ", HttpStatus.OK);
		}
		return new ResponseEntity<>("GeneralWelfare Delete Failed ", HttpStatus.BAD_REQUEST);

	}

}
