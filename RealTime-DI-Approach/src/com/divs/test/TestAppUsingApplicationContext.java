package com.divs.test;

import java.io.IOException;

import com.divs.comp.Flipkart;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAppUsingApplicationContext {

	public static void main(String[] args) throws IOException {
	ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
	 
	 System.out.println("Container started...");
	 System.in.read();
	 
	 Flipkart bean = factory.getBean("fpkt", Flipkart.class);
	 System.out.println(bean);
	 
	 System.out.println();
	 
	 String msg=bean.doShopping(new String[] {"fossil","tissot"}, new Float[] {12000.3f,340000.4f});
	 System.out.println(msg);

	}

}
