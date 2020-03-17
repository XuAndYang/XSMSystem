package com.sanxia.salesManagement.system.service;

import java.util.List;

import com.sanxia.salesManagement.system.model.DiscountInfo;

public interface DiscountInfoService {

	List<DiscountInfo> queryAllDiscountInfo();

	int addDiscountInfoByInfo(DiscountInfo d);

	DiscountInfo queryDiscountInfoById(int id);

	int updateDistributionInfoByDistribution(DiscountInfo d);

	int deleteDiscountInfoById(int id);

}
