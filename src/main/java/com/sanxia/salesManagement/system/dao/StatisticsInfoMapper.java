package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.StatisticsInfo;

public interface StatisticsInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StatisticsInfo record);

    int insertSelective(StatisticsInfo record);

    StatisticsInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StatisticsInfo record);

    int updateByPrimaryKey(StatisticsInfo record);
}