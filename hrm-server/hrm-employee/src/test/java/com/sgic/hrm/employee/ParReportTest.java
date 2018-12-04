package com.sgic.hrm.employee;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sgic.hrm.commons.entity.ReportParAppraise;
import com.sgic.hrm.commons.entity.ScoreParAppraisee;
import com.sgic.hrm.employee.service.ParReportForAppraiseeService;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ParReportTest {
	@Autowired
	ParReportForAppraiseeService parReportForAppraiseeService;
	
	@Test
	public void parReportTest1() {
	ReportParAppraise objParReport = new ReportParAppraise(1);
	List<ScoreParAppraisee> scheduleParAppraisorList=new ArrayList<ScoreParAppraisee>();
	scheduleParAppraisorList.add(new ScoreParAppraisee(1,"C001",3.00));
	scheduleParAppraisorList.add(new ScoreParAppraisee(2,"C002",4.00));
	scheduleParAppraisorList.add(new ScoreParAppraisee(3,"C003",5.00));
	parReportForAppraiseeService.saveReportAndScore(1, objParReport, scheduleParAppraisorList);
	}
}