package com.divs.test;

import com.divs.comp.Flipkart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		
		Flipkart fpkt=context.getBean("fpkt", Flipkart.class);
		System.out.println(fpkt);
		((AbstractApplicationContext) context).close();
	}
	}

