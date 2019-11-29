package com.woniu.service;

import java.util.List;

import com.woniu.domain.User;

public interface IUserService {

	User findUserByUser(User user);
	
	List<User> findAll();

	void update(User user);
	
}
