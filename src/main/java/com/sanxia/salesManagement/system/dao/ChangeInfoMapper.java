package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.ChangeInfo;

public interface ChangeInfoMapper {
    int deleteByPrimaryKey(Integer changeId);

    int insert(ChangeInfo record);

    int insertSelective(ChangeInfo record);

    ChangeInfo selectByPrimaryKey(Integer changeId);

    int updateByPrimaryKeySelective(ChangeInfo record);

    int updateByPrimaryKey(ChangeInfo record);
}