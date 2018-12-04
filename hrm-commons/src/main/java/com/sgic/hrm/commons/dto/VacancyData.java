package com.sgic.hrm.commons.dto;

import java.time.ZonedDateTime;

public class VacancyData {
	private Integer id;
	private Integer noOfVacancy;
	private Integer salaryScale;
	private ZonedDateTime vacancyOpenDate;
	private ZonedDateTime vacancyCloseDate;
	private ZonedDateTime interviewDate;
	private String keyRecuitment;
	
	private UserData user;
	private JobData job;
	private DepartmentData department;
	private RecruitmentTypeData recruitment;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNoOfVacancy() {
		return noOfVacancy;
	}
	public void setNoOfVacancy(Integer noOfVacancy) {
		this.noOfVacancy = noOfVacancy;
	}
	public Integer getSalaryScale() {
		return salaryScale;
	}
	public void setSalaryScale(Integer salaryScale) {
		this.salaryScale = salaryScale;
	}
	public ZonedDateTime getVacancyOpenDate() {
		return vacancyOpenDate;
	}
	public void setVacancyOpenDate(ZonedDateTime vacancyOpenDate) {
		this.vacancyOpenDate = vacancyOpenDate;
	}
	public ZonedDateTime getVacancyCloseDate() {
		return vacancyCloseDate;
	}
	public void setVacancyCloseDate(ZonedDateTime vacancyCloseDate) {
		this.vacancyCloseDate = vacancyCloseDate;
	}
	public ZonedDateTime getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(ZonedDateTime interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getKeyRecuitment() {
		return keyRecuitment;
	}
	public void setKeyRecuitment(String keyRecuitment) {
		this.keyRecuitment = keyRecuitment;
	}
	public UserData getUser() {
		return user;
	}
	public void setUser(UserData user) {
		this.user = user;
	}
	public JobData getJob() {
		return job;
	}
	public void setJob(JobData job) {
		this.job = job;
	}
	public DepartmentData getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentData department) {
		this.department = department;
	}
	public RecruitmentTypeData getRecruitment() {
		return recruitment;
	}
	public void setRecruitment(RecruitmentTypeData recruitment) {
		this.recruitment = recruitment;
	}
	
	
}
