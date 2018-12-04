package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.PromotionData;
import com.sgic.hrm.commons.entity.Promotion;

public class PromotionDataToPromotion {
	
	public static Promotion mapToPromotion(PromotionData promotionData) {
	    Promotion promotion = new Promotion();
	    if (promotionData != null) {
	      promotion.setId(promotionData.getId());
	      promotion.setRequestId(promotionData.getRequestId());
	      promotion.setDesignationId(promotionData.getDesignationId());
	      promotion.setPromotedDate(promotionData.getPromotedDate());
	      promotion.setRemark(promotionData.getRemark());
	      promotion.setSalary(promotionData.getSalary());
	      promotion.setSalary(promotionData.getPromotedBy());
	    }
	    return promotion;
	  }

	  public static List<Promotion> mapToPromotionDataList(
	      List<PromotionData> promotionDataList) {
	    List<Promotion> promotion = new ArrayList<Promotion>();

	    if (promotionDataList != null) {
	      for (PromotionData promotionData :promotionDataList) {
	        promotion.add(mapToPromotion(promotionData));
	      }
	    }
	    return promotion;
	  }

	
}
