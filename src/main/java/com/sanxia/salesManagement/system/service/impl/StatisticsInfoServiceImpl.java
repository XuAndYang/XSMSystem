package com.sanxia.salesManagement.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanxia.salesManagement.system.dao.StatisticsInfoMapper;
import com.sanxia.salesManagement.system.model.StatisticsInfo;
import com.sanxia.salesManagement.system.service.StatisticsInfoService;

@Service
public class StatisticsInfoServiceImpl implements StatisticsInfoService {
	@Autowired
	private StatisticsInfoMapper statisticsInfoMapper;

	@Override
	public int insertStatisticsInfo(StatisticsInfo s) {
		// TODO Auto-generated method stub
		return statisticsInfoMapper.insertStatisticsInfo(s);
	}

	@Override
	public List<StatisticsInfo> queryStatisticsInfo(Integer id) {
		// TODO Auto-generated method stub
		return statisticsInfoMapper.queryStatisticsInfo(id);
	}

}
