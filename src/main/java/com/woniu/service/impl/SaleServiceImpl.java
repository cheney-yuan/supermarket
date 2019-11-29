package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.SaleMapper;
import com.woniu.dao.UserMapper;
import com.woniu.domain.Sale;
import com.woniu.domain.User;
import com.woniu.domain.UserExample;
import com.woniu.service.ISaleService;
import com.woniu.service.IUserService;

@Service
public class SaleServiceImpl implements ISaleService {
	
	@Autowired
	private SaleMapper mapper;


	@Override
	public List<Sale> FindALl() {
       List<Sale> sales= mapper.selectFindAll();
		return sales;
	}

}
