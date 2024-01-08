package com.divs.test;

import java.io.IOException;

import com.divs.comp.Student;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class AdvancedBeanFactoryApp {

	
	public static void main(String[] args) throws IOException {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/divs/cfg/applicationConext.xml");
		
		
		System.out.println("container is started...");
		
		System.in.read();
		
		Student bean1 = factory.getBean("std1",Student.class);
		System.out.println(bean1);
		
		System.out.println("Container is closed..");
		
		
		


	}

}
