package com.sanxia.salesManagement.system.service;

import java.util.List;

import com.sanxia.salesManagement.system.model.OverInfo;

public interface OverInfoService {

	List<OverInfo> queryAllOverInfo();

	int addOverInfoByOverInfo(OverInfo over);

	OverInfo queryOverInfoById(int id);

	int updateOverInfoByOverInfo(OverInfo over);

	int deleteOverInfoById(int id);

}
