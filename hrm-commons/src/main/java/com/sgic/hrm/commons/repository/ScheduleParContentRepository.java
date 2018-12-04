package com.sgic.hrm.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.Par;
import com.sgic.hrm.commons.entity.ScheduleParContent;

@Repository
public interface ScheduleParContentRepository extends JpaRepository<ScheduleParContent, Integer> {
	public List<ScheduleParContent>findByParId(Par parId);
}

