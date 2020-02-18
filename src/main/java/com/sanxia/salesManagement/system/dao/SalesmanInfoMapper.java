package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.SalesmanInfo;

public interface SalesmanInfoMapper {
    int deleteByPrimaryKey(Integer salesmanId);

    int insert(SalesmanInfo record);

    int insertSelective(SalesmanInfo record);

    SalesmanInfo selectByPrimaryKey(Integer salesmanId);

    int updateByPrimaryKeySelective(SalesmanInfo record);

    int updateByPrimaryKey(SalesmanInfo record);
}