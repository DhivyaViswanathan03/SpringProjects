package com.divs.test;

import java.io.IOException;
import java.util.Arrays;

import com.divs.cfg.AppConfig;
import com.divs.comp.WishMessageGeneratorApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestApp {
	
	public static void main(String args[]) throws IOException {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("bean id's ::"+Arrays.toString(context.getBeanDefinitionNames()));
		
		System.in.read();
		
		WishMessageGeneratorApp wmg=context.getBean(WishMessageGeneratorApp.class);
		System.out.println(wmg);
		
		System.out.println(wmg.generateMessage("dhivya"));
		
		((AbstractApplicationContext) context).close();
	}
	}

