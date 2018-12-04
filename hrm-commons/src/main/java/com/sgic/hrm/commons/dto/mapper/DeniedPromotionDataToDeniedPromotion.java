package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.DeniedPromotionData;
import com.sgic.hrm.commons.entity.DeniedPromotion;


public class DeniedPromotionDataToDeniedPromotion {
	
	public static DeniedPromotion mapToDeniedPromotion(DeniedPromotionData deniedPromotionData) {
		DeniedPromotion deniedPromotion = new DeniedPromotion();
		if (deniedPromotionData != null) {
			deniedPromotion.setId(deniedPromotionData.getId());
			deniedPromotion.setRequsetId(deniedPromotionData.getRequsetId());
			deniedPromotion.setDesignationId(deniedPromotionData.getDesignationId());
			deniedPromotion.setDeniedDate(deniedPromotionData.getDeniedDate());
			deniedPromotion.setDeniedRemark(deniedPromotionData.getDeniedRemark());
			deniedPromotion.setDeniedBy(deniedPromotionData.getDeniedBy());
			deniedPromotion.setPosition(deniedPromotionData.getPosition());
			
		}
		return deniedPromotion;
	}

	public static List<DeniedPromotion> mapDeniedPromotionDataList(List<DeniedPromotionData> deniedPromotionDataList) {
		List<DeniedPromotion> deniedpromotion = new ArrayList<DeniedPromotion>();

		if (deniedPromotionDataList != null) {
			for (DeniedPromotionData deniedPromotionData : deniedPromotionDataList) {
				deniedpromotion.add(mapToDeniedPromotion(deniedPromotionData));
		      }
		    }
		    return deniedpromotion;
	}

}
