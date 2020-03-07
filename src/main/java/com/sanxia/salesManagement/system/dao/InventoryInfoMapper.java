package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.InventoryInfo;

public interface InventoryInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InventoryInfo record);

    int insertSelective(InventoryInfo record);

    InventoryInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InventoryInfo record);

    int updateByPrimaryKey(InventoryInfo record);
}