package com.sanxia.salesManagement.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanxia.salesManagement.system.dao.OverInfoMapper;
import com.sanxia.salesManagement.system.model.OverInfo;
import com.sanxia.salesManagement.system.service.OverInfoService;
@Service
public class OverInfoServiceImpl implements OverInfoService {
	@Autowired
	private OverInfoMapper overInfoMapper;

	@Override
	public List<OverInfo> queryAllOverInfo() {
		// TODO Auto-generated method stub
		return overInfoMapper.queryAllOverInfo();
	}
	 

}
