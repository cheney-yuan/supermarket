package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Product;
import com.woniu.service.IProductService;

@RestController
@RequestMapping("products")
public class ProductController {
	
	@Resource
	private IProductService service;
	
	@PostMapping
	public void save(@RequestBody Product product) {
		service.save(product);
	}
	
	@DeleteMapping("/{productId}")
	public void delete(@PathVariable String productId) {
		service.delete(productId);
	}
	
	@PutMapping
	public void update(@RequestBody Product product) {
		service.update(product);
	}
	
	@GetMapping("/{productId}")
	public Product findOne(@PathVariable String productId) {
		return service.findOne(productId);
	}
	
	@GetMapping
	public List<Product> findAll(){
		return service.findAll();
	}
	
	
	
	
	
	
}
