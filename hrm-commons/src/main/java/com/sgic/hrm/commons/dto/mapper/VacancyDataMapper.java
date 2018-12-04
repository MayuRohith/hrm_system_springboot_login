package com.sgic.hrm.commons.dto.mapper;


import com.sgic.hrm.commons.dto.VacancyData;
import com.sgic.hrm.commons.entity.Vacancy;

public class VacancyDataMapper {
	private VacancyDataMapper() {}
	public static Vacancy  vacancyDataMapper(VacancyData vacancyData) {
		Vacancy vacancy = new Vacancy();

		vacancy.setId(vacancyData.getId());
//		vacancy.setHiring_officer(vacancyDto.getHiring_officer());
		vacancy.setNoOfVacancy(vacancyData.getNoOfVacancy());
		vacancy.setSalaryScale(vacancyData.getSalaryScale());
		vacancy.setVacancyOpenDate(vacancyData.getVacancyOpenDate());
		vacancy.setVacancyCloseDate(vacancyData.getVacancyCloseDate());
		vacancy.setInterviewDate(vacancyData.getInterviewDate());
		vacancy.setKeyRecuitment(vacancyData.getKeyRecuitment());
		

		vacancy.setUser(UserDataMapper.userDataMapper(vacancyData.getUser()));
		vacancy.setJob(JobDataMapper.jobDataMapper(vacancyData.getJob()));
		vacancy.setDepartment(DepartmentDataMapper.departmentDataMapper(vacancyData.getDepartment()));
		vacancy.setRecruitment(RecruitmentTypeDataMapper.recruitmentDataMapper(vacancyData.getRecruitment()));
		
		
		return vacancy;
	    
}
	
}
