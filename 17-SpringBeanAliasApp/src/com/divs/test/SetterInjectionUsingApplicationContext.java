package com.divs.test;

import java.util.Arrays;

import com.divs.comp.WishMessagegenerator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionUsingApplicationContext {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		System.out.println("Application context is  started...");
		System.out.println(factory.getBeanDefinitionCount());
		System.out.println(Arrays.toString(factory.getBeanDefinitionNames()));
		
		WishMessagegenerator wmg =(WishMessagegenerator) factory.getBean("wmg",WishMessagegenerator.class);
		
		System.out.println(wmg+"wmg hashcode is::"+wmg.hashCode());

        WishMessagegenerator wishMessagegenerator =(WishMessagegenerator) factory.getBean("wishMessagegenerator",WishMessagegenerator.class);
		
        System.out.println(wishMessagegenerator+"wishMessagegenerator hashcode is::"+wishMessagegenerator.hashCode());
		
		((AbstractApplicationContext) factory).close();
		
		

	}

}
