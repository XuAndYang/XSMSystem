package com.sanxia.salesManagement.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.filter.AutoLoad;
import com.sanxia.salesManagement.system.dao.GoodsInfoMapper;
import com.sanxia.salesManagement.system.service.GoodsInfoService;
@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {
	@Autowired
	private GoodsInfoMapper goodsInfoMapper;

	@Override
	public String selectGoodsNameById(int goods_id) {
		// TODO Auto-generated method stub
		return goodsInfoMapper.selectGoodsNameById(goods_id);
	}

	@Override
	public int selectRemainingById(int goods_id) {
		// TODO Auto-generated method stub
		return goodsInfoMapper.selectRemainingById(goods_id);
	}
}
