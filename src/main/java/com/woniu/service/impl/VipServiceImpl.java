package com.woniu.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.VipMapper;
import com.woniu.domain.Page;
import com.woniu.domain.Vip;
import com.woniu.service.IVipService;
@Service
public class VipServiceImpl implements IVipService {
	
	@Autowired
	private VipMapper mapper;
	
	@Transactional
	@Override
	public void save(Vip vip) {
		mapper.insertSelective(vip);
	}

	@Transactional
	@Override
	public void delete(String vipId) {
		mapper.deleteByPrimaryKey(vipId);
	}

	@Transactional
	@Override
	public void update(Vip vip) {
		mapper.updateByPrimaryKeySelective(vip);
	}

	@Transactional(readOnly = true)
	@Override
	public Vip findOne(String vipId) {
		return mapper.selectByPrimaryKey(vipId);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Vip> findAll() {
		return mapper.selectByExample(null);
	}

	@Override
	public Integer getCount() {
		return (int) mapper.countByExample(null);
	}

	@Override
	public List<Vip> findByPage(Page<Vip> p) {
		RowBounds rowBounds = new RowBounds(p.getStartRow(),p.getSize());
		List<Vip> list = mapper.selectByExample(null, rowBounds);
		return list;
	}

}
