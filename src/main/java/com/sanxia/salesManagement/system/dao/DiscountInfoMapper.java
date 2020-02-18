package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.DiscountInfo;

public interface DiscountInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DiscountInfo record);

    int insertSelective(DiscountInfo record);

    DiscountInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiscountInfo record);

    int updateByPrimaryKey(DiscountInfo record);
}