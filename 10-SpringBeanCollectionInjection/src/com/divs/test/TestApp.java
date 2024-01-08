package com.divs.test;

import java.io.IOException;
import java.util.Arrays;

import com.divs.comp.College;
import com.divs.comp.ContactInfo;
import com.divs.comp.MarksInfo;
import com.divs.comp.UniversityInfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		System.out.println("Bean names::"+Arrays.toString(factory.getBeanDefinitionNames()));
		
		MarksInfo info=factory.getBean("marks",MarksInfo.class);
         System.out.println(info);
         
         College clgInfo=factory.getBean("clg",College.class);
         System.out.println(clgInfo);
         
         ContactInfo contactInfo=factory.getBean("contact",ContactInfo.class);
         System.out.println(contactInfo);
         
         UniversityInfo universityInfo=factory.getBean("uInfo",UniversityInfo.class);
         System.out.println(universityInfo);
	}

}
