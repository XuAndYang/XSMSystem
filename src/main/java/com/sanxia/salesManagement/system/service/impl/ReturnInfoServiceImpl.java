package com.sanxia.salesManagement.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanxia.salesManagement.system.dao.ReturnInfoMapper;
import com.sanxia.salesManagement.system.service.ReturnInfoService;
@Service
public class ReturnInfoServiceImpl implements ReturnInfoService {
	@Autowired
	private ReturnInfoMapper returnInfoMapper;

}
