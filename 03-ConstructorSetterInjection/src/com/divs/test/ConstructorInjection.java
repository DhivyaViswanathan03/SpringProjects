package com.divs.test;

import com.divs.comp.WishMessagegenerator;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class ConstructorInjection {

	public static void main(String[] args) {
		FileSystemResource res=new FileSystemResource("src/com/divs/cfg/applicationConext.xml");
		
		XmlBeanFactory factory=new XmlBeanFactory(res);
		System.out.println("Container started...");
		
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
