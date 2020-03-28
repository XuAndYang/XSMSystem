package com.sanxia.salesManagement.system.service;

import java.util.List;

import com.sanxia.salesManagement.system.model.InventoryInfo;

public interface InventoryInfoService {

 

	int insertInventoryInfo(InventoryInfo i);

	List<InventoryInfo> queryAllInventoryInfo();

}
