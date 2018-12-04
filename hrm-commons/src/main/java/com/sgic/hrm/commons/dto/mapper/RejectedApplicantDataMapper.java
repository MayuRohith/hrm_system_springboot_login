package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.RejectedApplicantData;
import com.sgic.hrm.commons.entity.RejectedApplicant;

public class RejectedApplicantDataMapper {
public RejectedApplicantDataMapper() {
		
	}
	
	public static RejectedApplicant rejectedApplicantDataMapper(RejectedApplicantData rejectedApplicantData) {
		RejectedApplicant rejectedApplicant = new RejectedApplicant();

		rejectedApplicant.setId(rejectedApplicantData.getId());
		rejectedApplicant.setReason(rejectedApplicantData.getReason());
		
	    
		rejectedApplicant.setApplicant(ApplicantDataMapper.applicantDataMapper(rejectedApplicantData.getApplicant()));
	    
		
	    return rejectedApplicant;
	  }

}
