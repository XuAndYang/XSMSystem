package com.sanxia.salesManagement.system.service.impl;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanxia.salesManagement.system.dao.SupplierGoodsMapper;
import com.sanxia.salesManagement.system.service.SupplierGoodsService;
@Service
public class SupplierGoodsServiceImpl implements SupplierGoodsService {
	@Autowired
	private SupplierGoodsMapper supplierGoodsMapper;

	@Override
	public BigDecimal selectPriceByIdAndTime(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return supplierGoodsMapper.selectPriceByIdAndTime(map);
	}

	@Override
	public int selectNumberByIdAndTime(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return supplierGoodsMapper.selectNumberByIdAndTime(map);
	}

}
