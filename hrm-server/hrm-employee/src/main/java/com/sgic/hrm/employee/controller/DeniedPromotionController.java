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

import com.sgic.hrm.commons.dto.DeniedPromotionData;
import com.sgic.hrm.commons.dto.mapper.DeniedPromotionDataToDeniedPromotion;

import com.sgic.hrm.commons.entity.mapper.DeniedPromotionToDeniedPromotionData;
import com.sgic.hrm.employee.service.DeniedPromotionService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class DeniedPromotionController {

	@Autowired
	DeniedPromotionService deniedPromotionService;

	@GetMapping("/denied/{id}")
	public ResponseEntity<DeniedPromotionData> getById(@PathVariable(name = "id") Integer id) {
		return new ResponseEntity<>(
				DeniedPromotionToDeniedPromotionData.mapToDeniedPromotionData(deniedPromotionService.getById(id)),
				HttpStatus.OK);
	}

	@GetMapping("/deniedpro")
	public ResponseEntity<List<DeniedPromotionData>> getAllDeniedPromotion() {

		return new ResponseEntity<>(DeniedPromotionToDeniedPromotionData
				.mapToDeniedPromotionDataList(deniedPromotionService.getAllDeniedPromotion()), HttpStatus.OK);
	}

	@PostMapping("/denied")
	public ResponseEntity<String> addDeniedPromotion(@RequestBody DeniedPromotionData deniedPromotionData) {

		if (deniedPromotionService
				.addDeniedPromotion(DeniedPromotionDataToDeniedPromotion.mapToDeniedPromotion(deniedPromotionData))) {
			return new ResponseEntity<>("DeniedPromotion Create Succesfully ", HttpStatus.OK);
		}
		return new ResponseEntity<>("DeniedPromotion Create Failed ", HttpStatus.BAD_REQUEST);
	}

	@PutMapping("/denied/{id}")
	public ResponseEntity<String> editDeniedPromotion(@PathVariable(name = "id") Integer id,
			@RequestBody DeniedPromotionData deniedPromotionData) {
		if (deniedPromotionService.editDeniedPromotion(
				DeniedPromotionDataToDeniedPromotion.mapToDeniedPromotion(deniedPromotionData), id)) {
			return new ResponseEntity<>("DeniedPromotion Update Succesfully ", HttpStatus.OK);
		}
		return new ResponseEntity<>("DeniedPromotion Update Failed ", HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/denied/{id}")
	public ResponseEntity<String> deleteDeniedPromotion(@PathVariable(name = "id") Integer id) {
		if (deniedPromotionService.deleteDeniedPromotion(id)) {
			return new ResponseEntity<>("DeniedPromotion Delete Succesfully ", HttpStatus.OK);
		}
		return new ResponseEntity<>("DeniedPromotion Delete Failed ", HttpStatus.BAD_REQUEST);

	}

}
