package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.ParAppraisor;

public interface ParAppraisorService {

	public List<ParAppraisor> getParAppraisor();

	public void createParAppraisor(ParAppraisor parAppraisor);

	public void updateParAppraisor(ParAppraisor parAppraisor, Integer id);

	public void deleteParAppraisor(Integer id);

}
