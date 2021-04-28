package com.proje.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.DbHelper;

public class TestSpring {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		DbHelper dbhelper = (DbHelper) context.getBean("dbhelper");
		
		dbhelper.openConnections();
		
		dbhelper.closeConnections();
		
		
		context.close();
	}	
}
