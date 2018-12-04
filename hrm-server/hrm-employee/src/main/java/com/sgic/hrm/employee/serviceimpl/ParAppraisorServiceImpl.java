package com.sgic.hrm.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.ParAppraisor;
import com.sgic.hrm.commons.repository.ParAppraisorRepository;
import com.sgic.hrm.employee.service.ParAppraisorService;

@Service
public class ParAppraisorServiceImpl implements ParAppraisorService {

	@Autowired
	private ParAppraisorRepository parAppraisorRepository;

	@Override
	public List<ParAppraisor> getParAppraisor() {
		return parAppraisorRepository.findAll();
	}

	@Override
	public void createParAppraisor(ParAppraisor parAppraisor) {
		parAppraisorRepository.save(parAppraisor);

	}

	@Override
	public void updateParAppraisor(ParAppraisor parAppraisor, Integer id) {
		ParAppraisor existParAppraisor = parAppraisorRepository.getOne(id);

		if (existParAppraisor.getId() != null) {
			parAppraisor.setId(id);
			parAppraisorRepository.save(parAppraisor);
		}
	}

	@Override
	public void deleteParAppraisor(Integer id) {
		parAppraisorRepository.deleteById(id);

	}

}
