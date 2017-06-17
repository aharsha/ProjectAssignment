package com.sna.config;



import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.sna.snaBackEnd.config.HibernateConfig;

public class ChatBucketInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {ChatBucketConfiguration.class,HibernateConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}

