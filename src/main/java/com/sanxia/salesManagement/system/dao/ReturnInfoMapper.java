package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.ReturnInfo;

public interface ReturnInfoMapper {
    int deleteByPrimaryKey(Integer returnId);

    int insert(ReturnInfo record);

    int insertSelective(ReturnInfo record);

    ReturnInfo selectByPrimaryKey(Integer returnId);

    int updateByPrimaryKeySelective(ReturnInfo record);

    int updateByPrimaryKey(ReturnInfo record);
}