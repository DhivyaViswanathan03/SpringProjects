package com.divs.test;

import java.io.IOException;

import com.divs.comp.A;
import com.divs.comp.B;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class TestApp {

	public static void main(String[] args) throws IOException {
	 DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
	 XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	 reader.loadBeanDefinitions("com/divs/cfg/applicationConext.xml");
	 
	 System.out.println("Container started...");
	 System.in.read();
	 
	 
	 A obj1=factory.getBean("a1",A.class);
	 
	System.out.println();
	 
	 B obj2=factory.getBean("b1",B.class);
	 
	 System.out.println();
	 


	}

}
