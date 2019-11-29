package com.woniu.web.controller;


import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.domain.Sale;
import com.woniu.domain.User;
import com.woniu.domain.Vip;
import com.woniu.service.ISaleService;
import com.woniu.service.IUserService;

@Controller
@RequestMapping("users")
public class SaleController {
	
	@Autowired
	private ISaleService service;

	@GetMapping
	private List<Sale> findsale(){
		List<Sale> list = service.FindALl();
		return list; 
	}
    	
	
}
