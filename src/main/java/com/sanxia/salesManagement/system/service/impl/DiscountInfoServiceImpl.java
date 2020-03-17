package com.sanxia.salesManagement.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanxia.salesManagement.system.dao.DiscountInfoMapper;
import com.sanxia.salesManagement.system.model.DiscountInfo;
import com.sanxia.salesManagement.system.service.DiscountInfoService;

@Service
public class DiscountInfoServiceImpl implements DiscountInfoService{
	@Autowired 
	private DiscountInfoMapper discountInfoMapper;

	@Override
	public List<DiscountInfo> queryAllDiscountInfo() {
		// TODO Auto-generated method stub
		return discountInfoMapper.queryAllDiscountInfo();
	}

	@Override
	public int addDiscountInfoByInfo(DiscountInfo d) {
		// TODO Auto-generated method stub
		return discountInfoMapper.addDiscountInfoByInfo(d);
	}

	@Override
	public DiscountInfo queryDiscountInfoById(int id) {
		// TODO Auto-generated method stub
		return discountInfoMapper.queryDiscountInfoById(id);
	}

	@Override
	public int updateDistributionInfoByDistribution(DiscountInfo d) {
		// TODO Auto-generated method stub
		return discountInfoMapper.updateDistributionInfoByDistribution(d);
	}

	@Override
	public int deleteDiscountInfoById(int id) {
		// TODO Auto-generated method stub
		return discountInfoMapper.deleteDiscountInfoById(id);
	}

}
