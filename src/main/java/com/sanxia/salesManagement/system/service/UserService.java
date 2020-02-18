package com.sanxia.salesManagement.system.service;

import java.util.List;

import com.sanxia.salesManagement.system.model.User;

public interface UserService{

	

	User queryUserByLogin_nameAndPassword(User user);

	List<User> queryAllUser();

	int addUserByUser(User u);

	int deleteUserByUser_id(int userId);

	User queryUserByUser_id(int userId);

	int updateUserById(User u);

}
