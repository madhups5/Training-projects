package com.npci.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTestCase {
	
	public static ApplicationContext context;
	//load the application context before any test case begins
	@BeforeAll//executed only once before any test case begins
	public static void load()
	{
		context= new ClassPathXmlApplicationContext("beans.xml");
	}
	@AfterAll//executed only once but after all the test case ends
	public static void unload()
	{
		ClassPathXmlApplicationContext c= (ClassPathXmlApplicationContext)context;
		c.close();
	}
	
	private Greetings greetings;
	//runs before each test case
	@BeforeEach
	public void initializeGreetings()
	{
		greetings=(Greetings)context.getBean("greet");
	}
	@AfterEach//runs after each test case
	public void deInitializeGreetings()
	{
		greetings=null;
	}
	@Test
	public void testGreetings()
	{
		String actual=greetings.greet("Madhu","English");
		assertEquals("Hello Madhu",actual); 
		actual=greetings.greet("Ram", "Hindi");
		assertEquals("Namasthey Ram",actual);
	}

}
