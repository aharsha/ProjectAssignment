package com.sna.snaBackEnd;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sna.snaBackEnd.dao.ClientDao;
import com.sna.snaBackEnd.model.Client;

public class ClientTest {

	private static AnnotationConfigApplicationContext context;
	private static ClientDao clientDao;
	private static Client client;
	
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.sna.snaBackEnd");
		context.refresh();
	clientDao=(ClientDao)context.getBean("clientDao");
	}
	
	@Test
	public void addTest()
	{
		client=new Client();
		client.setFirstName("sudhakar12334");
		client.setLastName("perumala");
		client.setEmail("sudhakar@gmail.com");
		client.setMobile("1234567890");
		client.setUserName("sudhakar");
		client.setPassword("sudhakar");
		
		assertEquals("success",true,clientDao.addClient(client));
		
	}
}
