package com.divs.test;

import java.util.Arrays;

import com.divs.comp.WishMessagegenerator;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class ConstructorInjectionUsingApplicationContext {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		System.out.println("Application context is  started...");
		System.out.println(factory.getBeanDefinitionCount());
		System.out.println(Arrays.toString(factory.getBeanDefinitionNames()));
		
		WishMessagegenerator obj =(WishMessagegenerator) factory.getBean("wmg",WishMessagegenerator.class);
		
		System.out.println(obj);
		
		
		String message=obj.generateMessage("Dhivya");
		System.out.println(obj.hashCode());
		
		System.out.println(message);
		
		System.out.println();
		
    WishMessagegenerator obj1 =(WishMessagegenerator) factory.getBean("wmg",WishMessagegenerator.class);
		
		System.out.println(obj1);
		
		
		String message1=obj1.generateMessage("Priya");
		System.out.println(message1);
		
		System.out.println(obj1.hashCode());
		
		System.out.println();
		
		

	}

}
