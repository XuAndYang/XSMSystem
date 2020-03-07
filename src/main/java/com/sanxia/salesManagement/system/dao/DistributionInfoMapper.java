package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.DistributionInfo;

public interface DistributionInfoMapper {
    int deleteByPrimaryKey(Integer distributionId);

    int insert(DistributionInfo record);

    int insertSelective(DistributionInfo record);

    DistributionInfo selectByPrimaryKey(Integer distributionId);

    int updateByPrimaryKeySelective(DistributionInfo record);

    int updateByPrimaryKey(DistributionInfo record);
}