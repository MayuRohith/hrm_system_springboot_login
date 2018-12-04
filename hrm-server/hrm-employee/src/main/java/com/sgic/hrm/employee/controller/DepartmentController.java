package com.sgic.hrm.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.DepartmentData;
import com.sgic.hrm.commons.dto.mapper.DepartmentDataMapper;
import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.employee.service.DepartmentService;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)


@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/department")
	public HttpStatus AddDepartment(@RequestBody DepartmentData departmentData) 
	{
		boolean testadd= departmentService.addDepartment(DepartmentDataMapper.departmentDataMapper(departmentData));
		
		if(testadd) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

 
	@GetMapping("/department")
	public ResponseEntity <List<Department>> GetDepartment()
	{
		List<Department> departments= departmentService.getDepartment();
		ResponseEntity<List<Department>> 
		response =  new ResponseEntity<>(departments,HttpStatus.OK);
		return response;
		
	}
	
}
