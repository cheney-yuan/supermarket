package com.woniu.service;

import com.woniu.domain.Staff;

public interface IStaffService {
	Staff findByUid(Integer uid);

	Staff findByUname(String uname);
}
