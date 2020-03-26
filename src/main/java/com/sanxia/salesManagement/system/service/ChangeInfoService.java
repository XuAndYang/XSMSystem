package com.sanxia.salesManagement.system.service;

import java.util.List;

import com.sanxia.salesManagement.system.model.ChangeInfo;

public interface ChangeInfoService {

	List<ChangeInfo> queryAllChangeInfo();

	int addChangeInfoByInfo(ChangeInfo c);

	ChangeInfo selectChangeInfoById(int changeId);

	int updateStatusByChange(ChangeInfo c);

}
