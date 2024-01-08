package com.divs.test;

import java.io.IOException;
import java.util.Arrays;

import com.divs.comp.EnggCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		System.out.println("Bean names::"+Arrays.toString(factory.getBeanDefinitionNames()));
		
		EnggCourse enggCourse = factory.getBean("engCourse1", EnggCourse.class);
		System.out.println(enggCourse);
		
		
	}

}
