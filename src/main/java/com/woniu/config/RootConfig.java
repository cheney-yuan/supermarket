package com.woniu.config;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.realm.jdbc.JdbcRealm.SaltStyle;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class RootConfig {
	
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dateSource() {
//    	return DataSourceBuilder.create().build();
//    }
	
	@Resource
	private DataSource  dataSource;
	
//	@Bean
//	public DataSource  dataSource(@Qualifier("dataSource") DataSource  dataSource) {
//		
//		DruidDataSource dataSource = new DruidDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/market_manage?characterEncoding=utf8");
//		dataSource.setUsername("root");
//		dataSource.setPassword("root");
//		return dataSource;
//	}
	
	
	@Bean
	public HashedCredentialsMatcher hcm() {
		HashedCredentialsMatcher hcm = new HashedCredentialsMatcher();
		hcm.setHashAlgorithmName("md5");
		hcm.setHashIterations(1024);
		return hcm;
	}
	
	@Bean
	public JdbcRealm realm() {
		JdbcRealm realm = new JdbcRealm();
		realm.setDataSource(dataSource);
		//realm.setDataSource(getDateSource());
		realm.setAuthenticationQuery("select upwd, salt from user where uname = ?");
		realm.setUserRolesQuery("select rname from user_role ur join user u on ur.uid = u.uid join role r on ur.rid = r.rid where uname = ?");
		realm.setPermissionsQuery("select pname from role_permission rp join role r on rp.rid = r.rid join permission p on rp.pid = p.pid where rname = ?");
		realm.setPermissionsLookupEnabled(true);
		realm.setCredentialsMatcher(hcm());
		realm.setSaltStyle(SaltStyle.COLUMN);
		return realm;
	}
	
	@Bean
	public DefaultWebSecurityManager securityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(realm());
		return securityManager;
	}
	
	@Bean
	public ShiroFilterFactoryBean shiroFilter() {
		ShiroFilterFactoryBean sf = new ShiroFilterFactoryBean();
		sf.setSecurityManager(securityManager());
		Map<String, String> map = new HashMap<>();
		sf.setFilterChainDefinitionMap(map);
		return sf;
	}
	
	@Bean
	public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor() {
		AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
		aasa.setSecurityManager(securityManager());
		return aasa;
	}
	
}
