package com.sanxia.salesManagement.system.dao;

import java.util.List;

import com.sanxia.salesManagement.system.model.WorkInfo;

public interface WorkInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkInfo record);

    int insertSelective(WorkInfo record);

    WorkInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkInfo record);

    int updateByPrimaryKey(WorkInfo record);
    //////////////////

	List<WorkInfo> queryAllWorkInfo();

	int addWorkInfoByWorkInfo(WorkInfo w);

	WorkInfo queryWorkInfoById(int id);

	int updateWorkInfoByWorkInfo(WorkInfo w);

	int deleteWorkInfoById(int id);

	List<WorkInfo> selectWorkInfoById(int salesmanId);

	List<WorkInfo> selectWorkInfoByIdAndTime(WorkInfo workInfo);
 
}