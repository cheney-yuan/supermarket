package com.woniu.service;

import java.util.List;

import com.woniu.domain.Page;
import com.woniu.domain.Vip;

public interface IVipService {
	void save(Vip vip);
	void delete(String vipId);
	void update(Vip vip);
	Vip findOne(String vipId);
	List<Vip> findAll();
	Integer getCount();
	List<Vip> findByPage(Page<Vip> p);
}
