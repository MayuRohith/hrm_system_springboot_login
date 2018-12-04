package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.UserCareerDevelopmentPlanCompanyData;
import com.sgic.hrm.commons.entity.UserCareerDevelopmentPlanCompany;

public class UserCareerDevelopmentPlanCompanyDataMapper {
  
private UserCareerDevelopmentPlanCompanyDataMapper() {}
  
  public static UserCareerDevelopmentPlanCompany userCareerDevelopmentPlanCompanyDataMapper(UserCareerDevelopmentPlanCompanyData userCareerDevelopmentPlanCompanyData) {
    UserCareerDevelopmentPlanCompany userCareerDevelopmentPlanCompany = new UserCareerDevelopmentPlanCompany();

    userCareerDevelopmentPlanCompany.setId(userCareerDevelopmentPlanCompanyData.getId());
    userCareerDevelopmentPlanCompany.setUserId(UserDataMapper.userDataMapper(userCareerDevelopmentPlanCompanyData.getUserId()));
    userCareerDevelopmentPlanCompany.setCdpId(CareerDevelopmentPlanDataMapper.careerDevelopmentPlanDataMapper(userCareerDevelopmentPlanCompanyData.getCdpId()));
    userCareerDevelopmentPlanCompany.setStatus(userCareerDevelopmentPlanCompanyData.getStatus());
    return userCareerDevelopmentPlanCompany;
  }

}
