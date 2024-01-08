package com.divs.test;

import java.util.Locale;

import com.divs.comp.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		
		Employee emp=context.getBean("emp", Employee.class);
		System.out.println(emp);
		
		
		((AbstractApplicationContext) context).close();
	}

}
