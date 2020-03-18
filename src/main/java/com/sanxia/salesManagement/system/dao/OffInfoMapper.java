package com.sanxia.salesManagement.system.dao;

import java.util.List;

import com.sanxia.salesManagement.system.model.OffInfo;

public interface OffInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OffInfo record);

    int insertSelective(OffInfo record);

    OffInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OffInfo record);

    int updateByPrimaryKey(OffInfo record);
//////////////////////
    
	List<OffInfo> queryAllOffInfo();

	int addOffInfoByOffInfo(OffInfo off);

	OffInfo queryOffInfoById(int id);

	int updateOffInfoByOffInfo(OffInfo off);

	int deleteOffInfoById(int id);
}