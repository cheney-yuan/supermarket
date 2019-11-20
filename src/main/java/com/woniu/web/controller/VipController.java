package com.woniu.web.controller;

import java.util.Collections;
import java.util.Comparator;
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

import com.woniu.domain.Vip;
import com.woniu.domain.Page;
import com.woniu.service.IVipService;

@RestController
@RequestMapping("/vip")
public class VipController {
	
	@Resource
	private IVipService service;
	
	@PostMapping
	private void saveVip(@RequestBody Vip vip) {
		List<Vip> vips = findVips();
		vips.sort(new Comparator<Vip>() {
			@Override
			public int compare(Vip o1, Vip o2) {
				return -o1.getVipId().compareTo(o2.getVipId());
			}
		});
		String vipId  = Integer.parseInt(vips.get(0).getVipId())+1+"";
		vip.setVipId(vipId);
		service.save(vip);
	}
	
	@DeleteMapping("/{vipId}")
	private void deleteVipById(@PathVariable String vipId) {
		service.delete(vipId); 
	}
	
	@PutMapping
	private void updateVip(@RequestBody Vip vip) {
		service.update(vip);
	}
	
	@GetMapping("/{vipId}")
	private Vip findVipById(@PathVariable String vipId) {
		return service.findOne(vipId);
	}
	
	@GetMapping
	private List<Vip> findVips(){
		List<Vip> list = service.findAll();
		return list; 
	}
	
	@GetMapping("/index/{index}")
	private Page<Vip> findVipsByIndex(@PathVariable Integer index){
		if(index == null) {
			index = 1;
		}
		Integer count = service.getCount();
		Page<Vip> p = new Page<Vip>(index,count,6);
		List<Vip> list = service.findByPage(p);
		p.setData(list);
		System.out.println(p);
		return p; 
	}
	
	
}
