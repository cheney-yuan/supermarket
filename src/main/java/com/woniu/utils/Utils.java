package com.woniu.utils;

import org.apache.shiro.crypto.hash.SimpleHash;

public class Utils {
	public static String getPassword(String password) {
		//String salt = UUID.randomUUID().toString().replaceAll("-", "");
		String salt = "abc";
		SimpleHash sh = new SimpleHash("MD5",password, salt, 1024);
		return sh.toHex();
	}
}
