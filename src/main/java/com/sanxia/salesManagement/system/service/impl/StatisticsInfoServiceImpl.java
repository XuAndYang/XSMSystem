package com.sanxia.salesManagement.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanxia.salesManagement.system.dao.StatisticsInfoMapper;
import com.sanxia.salesManagement.system.service.StatisticsInfoService;

@Service
public class StatisticsInfoServiceImpl implements StatisticsInfoService {
	@Autowired
	private StatisticsInfoMapper statisticsInfoMapper;

}
