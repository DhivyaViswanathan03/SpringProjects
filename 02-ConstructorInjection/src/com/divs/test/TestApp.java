package com.divs.test;

import java.util.Arrays;

import com.divs.comp.WishMessagegenerator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		
		System.out.println("Application context is created");
		
		System.out.println(factory.getBeanDefinitionCount());
		System.out.println(Arrays.toString(factory.getBeanDefinitionNames()));
		
		
		


	}

}
