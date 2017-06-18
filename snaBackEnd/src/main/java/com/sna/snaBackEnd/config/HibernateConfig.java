package com.sna.snaBackEnd.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@ComponentScan("com.sna.snaBackEnd")
@EnableTransactionManagement
public class HibernateConfig {
	
	
	
	@Bean
	public DataSource getDataSource()
	{
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("Assignment");
		dataSource.setPassword("harsha");
		return dataSource;
	}
	
	public Properties getProperties()
	{
		Properties properties=new Properties();
		  properties.setProperty("hibernate.show_sql", "true");
			properties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
			properties.setProperty("hibernate.hbm2ddl.auto", "update");
			properties.setProperty("hibernate.format_sql", "true");
			
			return properties;
		
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(getDataSource());
	    builder.addProperties(getProperties());
	    builder.scanPackages("com.sna.snaBackEnd.model");
	    System.out.println("in session Factory");
		return builder.buildSessionFactory();
	}

	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager htm=new HibernateTransactionManager();
		htm.setSessionFactory(getSessionFactory());
		System.out.println(htm);
		return htm;
		
	}
}
