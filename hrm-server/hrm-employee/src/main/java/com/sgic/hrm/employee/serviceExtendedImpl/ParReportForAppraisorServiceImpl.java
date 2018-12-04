package com.sgic.hrm.employee.serviceExtendedImpl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Par;
import com.sgic.hrm.commons.entity.ReportParAppraisor;
import com.sgic.hrm.commons.entity.ScoreParAppraisor;
import com.sgic.hrm.employee.service.ParReportForAppraisorService;
import com.sgic.hrm.employee.service.ParService;
import com.sgic.hrm.employee.service.ReportParAppraisorService;
import com.sgic.hrm.employee.service.ScoreParAppraisorService;

@Service
public class ParReportForAppraisorServiceImpl implements ParReportForAppraisorService {
	@Autowired
	ParService parService;
	@Autowired
	ReportParAppraisorService reportParAppraisorService;
	@Autowired
	ScoreParAppraisorService scoreParAppraisorService;

	@Override
	public void saveReportAndScoreAppraisor(Integer parId, ReportParAppraisor reportParAppraisor,
			List<ScoreParAppraisor> scoreParAppraisorList) {
		if (parService.findParById(parId) != null) {
			Par parObj = parService.findParById(parId);
			reportParAppraisorService.createReportParAppraise(reportParAppraisor, parObj);
			Iterator<ScoreParAppraisor> iterator = scoreParAppraisorList.iterator();
			while (iterator.hasNext()) {
				scoreParAppraisorService.createScoreParAppraisor(iterator.next(), reportParAppraisor);
			}

		}
	}

}