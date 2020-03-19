package com.sanxia.salesManagement.system.service.impl;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanxia.salesManagement.system.dao.TradeFinishMapper;
import com.sanxia.salesManagement.system.service.TradeFinishService;
@Service
public class TradeFinishServiceImpl implements TradeFinishService {
	@Autowired
	private TradeFinishMapper tradeFinishMapper;

	@Override
	public int selectSaleNumByIdAndTime(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return tradeFinishMapper.selectSaleNumByIdAndTime(map);
	}

	@Override
	public BigDecimal selectSalePriceByIdAndTime(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return tradeFinishMapper.selectSalePriceByIdAndTime(map);
	}
	

}
