package com.npci.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		//
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Greetings greeting=(Greetings)context.getBean("greet");
		String result=greeting.greet("Madhu Sir", "Telugu");
		System.out.println(result);
		ClassPathXmlApplicationContext c= (ClassPathXmlApplicationContext)context;
		c.close();
		
	}

}
