package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.OverInfo;

public interface OverInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OverInfo record);

    int insertSelective(OverInfo record);

    OverInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OverInfo record);

    int updateByPrimaryKey(OverInfo record);
}