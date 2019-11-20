package com.woniu.web.page;

public class DialectFactory {
	public static Dialect create(String type) {
		if("Mysql".equalsIgnoreCase(type)) {
			return new MySQLDialect();
		}else if("Oracle".equalsIgnoreCase(type)) {
			return null;
		}
		return null;
	}
}
