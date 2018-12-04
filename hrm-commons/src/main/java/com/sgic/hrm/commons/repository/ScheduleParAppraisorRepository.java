package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.Par;
import com.sgic.hrm.commons.entity.ScheduleParAppraisor;

@Repository

public interface ScheduleParAppraisorRepository extends JpaRepository<ScheduleParAppraisor, Integer> {
	public List<ScheduleParAppraisor>findByParId(Par parId);

}
