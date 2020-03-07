package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.PayoutInfo;

public interface PayoutInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayoutInfo record);

    int insertSelective(PayoutInfo record);

    PayoutInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayoutInfo record);

    int updateByPrimaryKey(PayoutInfo record);
}