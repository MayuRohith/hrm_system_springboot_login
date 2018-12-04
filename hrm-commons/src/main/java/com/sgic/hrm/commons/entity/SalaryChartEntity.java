package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "salary_chart")
public class SalaryChartEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6380894775207406278L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String empName;
	private Integer basicSalary;
	private String payee;
	private Integer netSalary;
	private Integer statutoryPayment;
	private Integer loan;
	private Integer epf;
	private Integer stampDuty;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Integer basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public Integer getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(Integer netSalary) {
		this.netSalary = netSalary;
	}

	public Integer getStatutoryPayment() {
		return statutoryPayment;
	}

	public void setStatutoryPayment(Integer statutoryPayment) {
		this.statutoryPayment = statutoryPayment;
	}

	public Integer getLoan() {
		return loan;
	}

	public void setLoan(Integer loan) {
		this.loan = loan;
	}

	public Integer getEpf() {
		return epf;
	}

	public void setEpf(Integer epf) {
		this.epf = epf;
	}

	public Integer getStampDuty() {
		return stampDuty;
	}

	public void setStampDuty(Integer stampDuty) {
		this.stampDuty = stampDuty;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
