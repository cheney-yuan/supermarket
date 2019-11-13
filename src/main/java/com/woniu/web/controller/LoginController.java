package com.woniu.web.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.User;
import com.woniu.service.IUserService;

@RestController
public class LoginController {
	
	@Autowired
	private IUserService service;
	
	@PostMapping("/login")
	public void login(@RequestBody User user){
		Subject subject = SecurityUtils.getSubject();
		System.out.println(subject.getSession().getId());
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUname(),user.getUpwd());
		subject.login(token);
	}
	
	@GetMapping("/authentication")
	public Boolean isLogin() {
		Subject subject = SecurityUtils.getSubject();
		System.out.println(subject.getSession().getId());
		System.out.println(subject.isAuthenticated());
		return subject.isAuthenticated(); 
	}
	
	@GetMapping("/logout")
	public void logout() {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
	}
	
}
