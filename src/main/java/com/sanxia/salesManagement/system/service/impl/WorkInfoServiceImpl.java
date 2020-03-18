package com.sanxia.salesManagement.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanxia.salesManagement.system.dao.WorkInfoMapper;
import com.sanxia.salesManagement.system.model.WorkInfo;
import com.sanxia.salesManagement.system.service.WorkInfoService;

@Service
public class WorkInfoServiceImpl implements WorkInfoService {
	@Autowired
	private WorkInfoMapper workInfoMapper;

	@Override
	public List<WorkInfo> queryAllWorkInfo() {
		// TODO Auto-generated method stub
		return workInfoMapper.queryAllWorkInfo();
	}

	@Override
	public int addWorkInfoByWorkInfo(WorkInfo w) {
		// TODO Auto-generated method stub
		return workInfoMapper.addWorkInfoByWorkInfo(w);
	}

	@Override
	public WorkInfo queryWorkInfoById(int id) {
		// TODO Auto-generated method stub
		return workInfoMapper.queryWorkInfoById(id);
	}

	@Override
	public int updateWorkInfoByWorkInfo(WorkInfo w) {
		// TODO Auto-generated method stub
		return workInfoMapper.updateWorkInfoByWorkInfo(w);
	}

	@Override
	public int deleteWorkInfoById(int id) {
		// TODO Auto-generated method stub
		return workInfoMapper.deleteWorkInfoById(id);
	}

	@Override
	public List<WorkInfo> selectWorkInfoById(int salesmanId) {
		// TODO Auto-generated method stub
		return  workInfoMapper.selectWorkInfoById(salesmanId);
	}

	@Override
	public List<WorkInfo> selectWorkInfoByIdAndTime(WorkInfo workInfo) {
		// TODO Auto-generated method stub
		return workInfoMapper.selectWorkInfoByIdAndTime(workInfo);
	}

	 

}
