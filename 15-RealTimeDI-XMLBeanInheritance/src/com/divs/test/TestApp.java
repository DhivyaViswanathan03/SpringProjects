package com.divs.test;

import java.io.IOException;
import java.util.Scanner;

import com.divs.controller.CustomerController;
import com.divs.vo.CustomerVo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) throws IOException {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter customer name:: ");
		String cusName=in.next();
		System.out.print("Enter customer Address:: ");
		String cusAddr=in.next();
		System.out.print("Enter principal Amount:: ");
		String pAmount=in.next();
		System.out.print("Enter rate of interest:: ");
		String rate=in.next();
		System.out.print("Enter time interval:: ");
		String time=in.next();
		
		CustomerVo vo=new CustomerVo();
		vo.setCusName(cusName);
		vo.setCusAddr(cusAddr);
		vo.setpAmt(pAmount);
		vo.setRate(rate);
		vo.setTime(time);
		
//	 DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//	 XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//	 reader.loadBeanDefinitions("com/divs/cfg/applicationContext.xml");
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/divs/cfg/applicationContext.xml");
	 
	 System.out.println("Container started...");
	 
	 CustomerController controller=factory.getBean("customerController",CustomerController.class);
	 
	 try {
		String result=controller.processCustomer(vo);
		System.out.println(result);
	} catch (Exception e) {
		System.out.println("exception occured..try again.."+e.getMessage());
	}
	
	 
	 
	

	}

}
