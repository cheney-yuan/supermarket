package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Staff;
import com.woniu.domain.User;
import com.woniu.service.IStaffService;
import com.woniu.service.IUserService;

@RestController
@RequestMapping("staff")
public class StaffController {
	
	@Autowired
	private IStaffService service;
	
	@GetMapping("/{uid}")
	public Staff findStaffByUid(@PathVariable Integer uid){
		Staff staff = service.findByUid(uid);
		return staff;
	}
	
	@GetMapping("/find/{uname}")
	public Staff findStaffByUname(@PathVariable String uname) {
		Staff staff = service.findByUname(uname);
		return staff;
	}
}
