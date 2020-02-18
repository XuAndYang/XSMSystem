package com.sanxia.salesManagement.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanxia.salesManagement.system.dao.PermissionMapper;
import com.sanxia.salesManagement.system.dao.RoleMapper;
import com.sanxia.salesManagement.system.model.Permission;
import com.sanxia.salesManagement.system.model.User;
import com.sanxia.salesManagement.system.service.PermissionService;
@Service
public class PermissionServiceImpl implements PermissionService{

	@Autowired
	private  PermissionMapper  permissionMapper;
	

	@Override
	public List<Permission> queryAllPermission() {
		// TODO Auto-generated method stub
		return permissionMapper.queryAllPermission();
	}

	@Override
	public int addPermissionByPermission(Permission p) {
		// TODO Auto-generated method stub
		return permissionMapper.addPermissionByPermission(p);
	}

	
	
//查询权限菜单
	 
	@Override
	public List<Permission> queryMenuByUserId(int user_id) {
		// TODO Auto-generated method stub
		return permissionMapper.queryMenuByUserId(user_id);
	}

	@Override
	public List<Permission> querypermissionByPId_Son(int permissionId) {
		// TODO Auto-generated method stub
		return permissionMapper.querypermissionByPId_Son(permissionId);
	}

	 
}
