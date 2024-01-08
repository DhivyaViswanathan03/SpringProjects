package com.divs.test;

import java.io.IOException;
import java.util.Arrays;

import com.divs.comp.WishMessagegenerator;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		
		System.in.read();
		
		WishMessagegenerator obj =(WishMessagegenerator) factory.getBean("wmg",WishMessagegenerator.class);
		System.out.println(obj +"hash code::"+obj.hashCode());
		
		
		WishMessagegenerator obj1 =(WishMessagegenerator) factory.getBean("wmg",WishMessagegenerator.class);
		System.out.println(obj1+"hash code::"+obj1.hashCode());
		
		
		

	}

}
