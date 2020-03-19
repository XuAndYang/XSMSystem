package com.sanxia.salesManagement.system.service;

import java.util.List;

import com.sanxia.salesManagement.system.model.OffInfo;

public interface OffInfoService {

	List<OffInfo> queryAllOffInfo();

	int addOffInfoByOffInfo(OffInfo off);

	OffInfo queryOffInfoById(int id);

	int updateOffInfoByOffInfo(OffInfo off);

	int deleteOffInfoById(int id);

}
