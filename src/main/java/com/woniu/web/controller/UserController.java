package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.User;
import com.woniu.service.IUserService;
import com.woniu.utils.Utils;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private IUserService service;
	
	@GetMapping
	public List<User> findUsers(){
		List<User> list = service.findAll();
		return list;
	}
	
	@GetMapping("/{uname}/{upwd}")
	public User findUserByUser(@PathVariable String uname,@PathVariable String upwd){
		User user = new User();
		user.setUname(uname);
		user.setUpwd(upwd);
		User u = service.findUserByUser(user);
		System.out.println(u.getUid());
		return u;
	}
	
	@PutMapping("/pwd")
	public void updatePwd(@RequestBody User user) {
		//System.out.println(user.getUid()+"------"+user.getUname()+"---"+user.getUpwd());
		user.setUpwd(Utils.getPassword(user.getUpwd()));
		service.update(user);
	}
}
