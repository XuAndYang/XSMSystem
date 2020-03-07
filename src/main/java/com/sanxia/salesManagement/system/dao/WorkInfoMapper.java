package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.WorkInfo;

public interface WorkInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkInfo record);

    int insertSelective(WorkInfo record);

    WorkInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkInfo record);

    int updateByPrimaryKey(WorkInfo record);
}