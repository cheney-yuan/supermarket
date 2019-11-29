package com.woniu.service;

import java.util.List;

import com.woniu.domain.Product;

public interface IProductService {
	void save(Product product);
	void delete(String productId);
	void update(Product product);
	Product findOne(String productId);
	List<Product> findAll();
}
