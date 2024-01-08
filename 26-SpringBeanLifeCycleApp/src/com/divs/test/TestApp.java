package com.divs.test;

import java.io.IOException;
import java.util.Arrays;

import com.divs.comp.Vote;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	
	public static void main(String args[]) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/divs/cfg/applicationConext.xml");
		System.out.println("bean id's ::"+Arrays.toString(context.getBeanDefinitionNames()));
		System.in.read();
		
		Vote v=context.getBean(Vote.class);
		System.out.println(v);
		System.out.println(v.checkVotingEligibility());
		((AbstractApplicationContext) context).close();
	}
	}

