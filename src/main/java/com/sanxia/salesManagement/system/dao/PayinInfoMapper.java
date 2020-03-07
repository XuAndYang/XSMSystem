package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.PayinInfo;

public interface PayinInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayinInfo record);

    int insertSelective(PayinInfo record);

    PayinInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayinInfo record);

    int updateByPrimaryKey(PayinInfo record);
}