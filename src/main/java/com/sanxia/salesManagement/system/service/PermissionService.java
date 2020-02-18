package com.sanxia.salesManagement.system.service;

import java.util.List;

import com.sanxia.salesManagement.system.model.Permission;
import com.sanxia.salesManagement.system.model.User;

public interface PermissionService {

	List<Permission> queryAllPermission();

	int addPermissionByPermission(Permission p);

	List<Permission> queryMenuByUserId(int user_id);

	List<Permission> querypermissionByPId_Son(int permissionId);

}
