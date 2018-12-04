package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.Par;

public interface ParService {

	public Par findParById(Integer id);
	
	public boolean createPar(Par par);
	List<Par>parHistory();
	public List<Par> findByEmployeeId(String id);
}
