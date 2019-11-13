package com.woniu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // 需要扫包
public class AppConfig implements WebMvcConfigurer {
	// 配置跨域请求
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		System.out.println("跨域请求");
		// TODO Auto-generated method stub
		registry.addMapping("/**")  // 允许访问任何资源
				.allowedOrigins("*") // 允许任何客户端访问
				.allowedMethods("GET","POST","DELETE","PUT","OPTIONS")// 允许请求方式
				.allowedHeaders("Content-Type","Accept") // 允许请求头
				.allowCredentials(true); // 客户端cookie
	}
}
