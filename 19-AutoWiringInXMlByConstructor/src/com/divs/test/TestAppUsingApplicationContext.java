package com.divs.test;

import java.io.IOException;

import com.divs.comp.Flipkart;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAppUsingApplicationContext {

	public static void main(String[] args) throws IOException {
	ApplicationContext factory = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
	 
	 System.out.println("Container started...");
	 
	 Flipkart bean = factory.getBean("fpkt", Flipkart.class);
	 System.out.println(bean);
	 
	 ((AbstractApplicationContext) factory).close();
	 
	 
	

	}

}
