package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.GeneralWelfareData;
import com.sgic.hrm.commons.entity.GeneralWelfare;

public class GeneralWelfareDataToGeneralWelfare {
	
	public static GeneralWelfare maptoGeneralWelfare(GeneralWelfareData generalWelfaredata) {
		GeneralWelfare generalWelfare=new GeneralWelfare();
		
		if(generalWelfaredata!=null) {
		generalWelfare.setId(generalWelfaredata.getId());
		generalWelfare.setDetails(generalWelfaredata.getDetails());
		generalWelfare.setWelfareEvent(WelfareEventDtoToWelfareEvent.WelfareEventDtoToWelfareEvent(generalWelfaredata.getWelfareEvent()));
		}
		return generalWelfare;
	}
	
	public static List<GeneralWelfare> maptoGeneralWelfareDataList(
			List<GeneralWelfareData> generalWelfareDataList){
		List<GeneralWelfare> generalWelfare=new ArrayList<GeneralWelfare>();
		
		if(generalWelfareDataList !=null) {
			for(GeneralWelfareData generalWelfareData:generalWelfareDataList) {
				generalWelfare.add(maptoGeneralWelfare(generalWelfareData));
			}
		}
		return generalWelfare;
	}

}

