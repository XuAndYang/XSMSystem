package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.OffInfo;

public interface OffInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OffInfo record);

    int insertSelective(OffInfo record);

    OffInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OffInfo record);

    int updateByPrimaryKey(OffInfo record);
}