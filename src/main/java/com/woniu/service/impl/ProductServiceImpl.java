package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ProductMapper;
import com.woniu.domain.Product;
import com.woniu.service.IProductService;
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
	@Resource
	private ProductMapper mapper;

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		mapper.insertSelective(product);
	}

	@Override
	public void delete(String productId) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(productId);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(product);
	}

	@Override
	public Product findOne(String productId) {
		return mapper.selectByPrimaryKey(productId);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		List<Product> products = mapper.selectByExample(null);
		return products;
	}

}
