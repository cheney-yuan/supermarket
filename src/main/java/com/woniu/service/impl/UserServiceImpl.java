package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.UserMapper;
import com.woniu.domain.User;
import com.woniu.domain.UserExample;
import com.woniu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper mapper;
	
	@Override
	public User findUserByUser(User user) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		example.or().andUnameEqualTo(user.getUname());
		example.or().andUpwdEqualTo(user.getUpwd());
		List<User> list = mapper.selectByExample(example);
		return list.size()==0?null:list.get(0); 
	}

	@Override
	public List<User> findAll() {
		return mapper.selectAll();
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(user);
	}

}
