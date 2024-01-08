package com.divs.test;

import com.divs.comp.Student;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestApp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		FileSystemResource resource = new FileSystemResource("src/com/divs/cfg/applicationConext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		Student bean1 = factory.getBean("std1",Student.class);
		System.out.println(bean1);
		
		Student bean2 = factory.getBean("std2",Student.class);
		System.out.println(bean2);
		
		Student bean3 = factory.getBean("std3",Student.class);
		System.out.println(bean3);
		
		
		


	}

}
