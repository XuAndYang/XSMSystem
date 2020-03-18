package com.sanxia.salesManagement.system.service;

import java.util.List;

import com.sanxia.salesManagement.system.model.WorkInfo;

public interface WorkInfoService {

	List<WorkInfo> queryAllWorkInfo();

	int addWorkInfoByWorkInfo(WorkInfo w);

	WorkInfo queryWorkInfoById(int id);

	int updateWorkInfoByWorkInfo(WorkInfo w);

	int deleteWorkInfoById(int id);

	List<WorkInfo> selectWorkInfoById(int salesmanId);

	List<WorkInfo> selectWorkInfoByIdAndTime(WorkInfo workInfo);

 

}
