package com.woniu.web.page;

import java.sql.Connection;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;


@Intercepts(@Signature(type=StatementHandler.class,method="prepare",args= {Connection.class,Integer.class}))
public class PageInterceptor implements Interceptor {

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		StatementHandler statementHandler  = (StatementHandler) invocation.getTarget();
		MetaObject metaObject = MetaObject.forObject(statementHandler,new DefaultObjectFactory(), new DefaultObjectWrapperFactory(),new DefaultReflectorFactory());
		RowBounds rb = (RowBounds) metaObject.getValue("delegate.rowBounds");
		if(rb!=null && !rb.equals(RowBounds.DEFAULT)) {
			String oldSql = metaObject.getValue("delegate.boundSql.sql").toString();
			int limit = rb.getLimit();
			int offset = rb.getOffset();
			
		 	Configuration config = (Configuration) metaObject.getValue("delegate.configuration");
		 	String type = config.getVariables().getProperty("dialect");
		 	
		 	Dialect dialect = DialectFactory.create(type);
		 	String pageSql = dialect.getPageSql(oldSql, offset, limit);
		 	metaObject.setValue("delegate.boundSql.sql", pageSql);
		 	metaObject.setValue("delegate.rowBounds.limit",RowBounds.NO_ROW_LIMIT);
			metaObject.setValue("delegate.rowBounds.offset",RowBounds.NO_ROW_OFFSET);
		}
		Object obj = invocation.proceed();
		return obj;
	}


}
