package com.divs.test;

import java.io.IOException;
import java.util.Arrays;

import com.divs.comp.Student;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		System.out.println("Bean names"+Arrays.toString(factory.getBeanDefinitionNames()));
		System.in.read();
		
		Student obj=factory.getBean("com.divs.comp.Student#0",Student.class);
		System.out.println(obj+"hash code value::"+obj.hashCode());
		
		

	}

}
