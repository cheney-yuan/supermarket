package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.StaffMapper;
import com.woniu.domain.Staff;
import com.woniu.domain.StaffExample;
import com.woniu.service.IStaffService;



@Service
public class StaffServiceImpl implements IStaffService {
	
	@Autowired
	private StaffMapper mapper;

	@Override
	public Staff findByUid(Integer uid) {
		// TODO Auto-generated method stub
		StaffExample example = new StaffExample();
		example.or().andUidEqualTo(uid);
		List<Staff> list = mapper.selectByExample(example);
		return list==null?null:list.get(0);
	}

	@Override
	public Staff findByUname(String uname) {
		StaffExample example = new StaffExample();
		example.or().andStaffNameEqualTo(uname);
		List<Staff> list = mapper.selectByExample(example);
		return list==null?null:list.get(0);
	}
	


}
