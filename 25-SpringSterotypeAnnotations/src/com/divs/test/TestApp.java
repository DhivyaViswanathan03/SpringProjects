package com.divs.test;

import java.io.IOException;

import com.divs.comp.Flipkart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	
	public static void main(String args[]) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		
		System.in.read();
		
		Flipkart fpkt1=context.getBean("flipkart", Flipkart.class);
		Flipkart fpkt2=context.getBean("flipkart", Flipkart.class);
		System.out.println(fpkt1.hashCode());
		System.out.println(fpkt2.hashCode());
		((AbstractApplicationContext) context).close();
	}
	}

