package com.divs.test;

import java.io.IOException;
import java.util.Arrays;

import com.divs.comp.PersonInfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		System.out.println("Bean names::"+Arrays.toString(factory.getBeanDefinitionNames()));
		
		System.in.read();
		
		PersonInfo personInfo=factory.getBean("pInfo", PersonInfo.class);
		System.out.println(personInfo);
	}

}
