package com.sanxia.salesManagement.system.dao;

import java.util.List;

import com.sanxia.salesManagement.system.model.OverInfo;

public interface OverInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OverInfo record);

    int insertSelective(OverInfo record);

    OverInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OverInfo record);

    int updateByPrimaryKey(OverInfo record);

	List<OverInfo> queryAllOverInfo();

	int addOverInfoByOverInfo(OverInfo over);

	OverInfo queryOverInfoById(int id);

	int updateOverInfoByOverInfo(OverInfo over);

	int deleteOverInfoById(int id);
}