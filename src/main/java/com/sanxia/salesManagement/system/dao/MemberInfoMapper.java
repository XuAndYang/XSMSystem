package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.MemberInfo;

public interface MemberInfoMapper {
    int deleteByPrimaryKey(Integer vipId);

    int insert(MemberInfo record);

    int insertSelective(MemberInfo record);

    MemberInfo selectByPrimaryKey(Integer vipId);

    int updateByPrimaryKeySelective(MemberInfo record);

    int updateByPrimaryKey(MemberInfo record);
}