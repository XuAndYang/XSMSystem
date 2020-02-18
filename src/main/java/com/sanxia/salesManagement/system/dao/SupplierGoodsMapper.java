package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.SupplierGoods;

public interface SupplierGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SupplierGoods record);

    int insertSelective(SupplierGoods record);

    SupplierGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SupplierGoods record);

    int updateByPrimaryKey(SupplierGoods record);
}