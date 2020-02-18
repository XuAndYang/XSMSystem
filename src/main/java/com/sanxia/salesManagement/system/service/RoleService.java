package com.sanxia.salesManagement.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanxia.salesManagement.system.dao.RoleMapper;
import com.sanxia.salesManagement.system.model.Role;


public interface RoleService {

	List<Role> queryAllRole();

	int addRoleByRole(Role role);

	Role queryRoleByRole_id(int roleId);

	int updateRoleById(Role role);

	int deleteRoleByRole_id(int role_id);
	
	

}
