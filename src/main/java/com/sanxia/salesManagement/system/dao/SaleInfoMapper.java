package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.SaleInfo;

public interface SaleInfoMapper {
    int deleteByPrimaryKey(Integer saleId);

    int insert(SaleInfo record);

    int insertSelective(SaleInfo record);

    SaleInfo selectByPrimaryKey(Integer saleId);

    int updateByPrimaryKeySelective(SaleInfo record);

    int updateByPrimaryKey(SaleInfo record);
}