package com.sanxia.salesManagement.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanxia.salesManagement.system.dao.OffInfoMapper;
import com.sanxia.salesManagement.system.model.OffInfo;
import com.sanxia.salesManagement.system.service.OffInfoService;
 

@Service
public class OffInfoServiceImpl implements OffInfoService {
	@Autowired
	private OffInfoMapper offInfoMappper;

	@Override
	public List<OffInfo> queryAllOffInfo() {
		// TODO Auto-generated method stub
		return offInfoMappper.queryAllOffInfo();
	}

	@Override
	public int addOffInfoByOffInfo(OffInfo off) {
		// TODO Auto-generated method stub
		return offInfoMappper.addOffInfoByOffInfo(off);
	}

	@Override
	public OffInfo queryOffInfoById(int id) {
		// TODO Auto-generated method stub
		return offInfoMappper.queryOffInfoById(id);
	}

	@Override
	public int updateOffInfoByOffInfo(OffInfo off) {
		// TODO Auto-generated method stub
		return offInfoMappper.updateOffInfoByOffInfo(off);
	}

	@Override
	public int deleteOffInfoById(int id) {
		// TODO Auto-generated method stub
		return offInfoMappper.deleteOffInfoById(id) ;
	}
}
