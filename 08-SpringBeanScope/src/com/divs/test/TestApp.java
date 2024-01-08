package com.divs.test;

import java.io.IOException;

import com.divs.comp.Printer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		
		System.in.read();
		
		Printer obj = factory.getBean("printer",Printer.class);
		System.out.println(obj+"hash code value::"+obj.hashCode());
		
		Printer obj1 = factory.getBean("printer",Printer.class);
		System.out.println(obj1+"hash code value::"+obj1.hashCode());
		
		

	}

}
