package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.CodeInfo;

public interface CodeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CodeInfo record);

    int insertSelective(CodeInfo record);

    CodeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CodeInfo record);

    int updateByPrimaryKey(CodeInfo record);
}